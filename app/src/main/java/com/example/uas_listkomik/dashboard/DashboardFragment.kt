package com.example.uas_listkomik.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.uas_listkomik.databinding.FragmentDashboardBinding
import com.example.uas_listkomik.komik.CharCategory
import com.example.uas_listkomik.komik.KomikAdapter
import com.example.uas_listkomik.komik.generateDataList
import java.util.Locale

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.manhwa.setOnClickListener {
            filterList(CharCategory.MANHWA) // Panggil filterList dengan kategori MANHWA
        }
        binding.manga.setOnClickListener {
            filterList(CharCategory.MANGA) // Panggil filterList dengan kategori MANGA
        }


        binding.rvListExplore.layoutManager = GridLayoutManager(context, 3)
        val data = generateDataList()
        binding.rvListExplore.adapter = KomikAdapter(data)


        //search

        binding.searchView.setOnClickListener {
            binding.searchView.isIconified = false
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterSearch(newText.toString())
                return true
            }

        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun filterList(category: CharCategory) {
        val data = generateDataList()
        val filteredList = data.filter {
            it.kategori == category
        }
        binding.rvListExplore.adapter = KomikAdapter(filteredList)
        if (filteredList.isEmpty()) {
            Toast.makeText(requireContext(), "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
        }
    }

    //search

    private fun filterSearch(query: String) {
        val data = generateDataList()
        val filteredList = data.filter { it.nama.lowercase(Locale.ROOT).contains(query.lowercase(
            Locale.ROOT)) }
        if (filteredList.isEmpty()) {
            Toast.makeText(context, "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
        } else {
            (binding.rvListExplore.adapter as? KomikAdapter)?.setFilteredList(filteredList) // Assuming adapter has a function named setFilteredList
        }
    }

}
