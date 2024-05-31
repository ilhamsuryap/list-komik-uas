package com.example.uas_listkomik.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.uas_listkomik.R
import com.example.uas_listkomik.databinding.FragmentHomeBinding
import com.example.uas_listkomik.komik.KomikAdapter
import com.example.uas_listkomik.komik.dataList
import com.example.uas_listkomik.komik.generateDataList
import java.util.Locale

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Initialize RecyclerView
        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val context = activity ?: return
        binding.rvDataList.layoutManager = GridLayoutManager(context, 3)
        val data = generateDataList()
        binding.rvDataList.adapter = KomikAdapter(data)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.manhwa.setOnClickListener {
            val query = "MAHNWA" // Replace with your hardcoded query
            filterList(query)
        }
        binding.manga.setOnClickListener {
            val query = "MANGA" // Replace with your hardcoded query
            filterList(query)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun filterList(query: String) {
        val data = generateDataList()
        val filteredList = data.filter {
            it.kategori.lowercase(Locale.ROOT).contains(
                query.lowercase(Locale.ROOT)
            )
        }
        if (filteredList.isEmpty()) {
            Toast.makeText(context, "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
        } else {
            // Update your RecyclerView adapter with the filtered list
//            (binding.rvBioList.adapter as? rvBiodataAdapter)?.setFilteredList(filteredList)
        }
    }

}