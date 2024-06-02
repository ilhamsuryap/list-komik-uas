package com.example.uas_listkomik.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uas_listkomik.databinding.FragmentDashboardBinding
import com.example.uas_listkomik.databinding.FragmentHomeBinding
import com.example.uas_listkomik.komik.KomikAdapter
import com.example.uas_listkomik.komik.generateDataList
import java.util.Locale
import com.example.uas_listkomik.komik.CharCategory // Import enum CharCategory
import com.example.uas_listkomik.komik.generateDataList // Import generateDataList function

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()

        binding.manhwa.setOnClickListener {
            filterList(CharCategory.MANHWA) // Panggil filterList dengan kategori MANHWA
        }
        binding.manga.setOnClickListener {
            filterList(CharCategory.MANGA) // Panggil filterList dengan kategori MANGA
        }

        binding.rvDataList.layoutManager = GridLayoutManager(context, 3)
        val data = generateDataList()
        binding.rvDataList.adapter = KomikAdapter(data)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setupRecyclerView() {
        val context = activity ?: return
        binding.rvDataList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val data = generateDataList()
        binding.rvDataList.adapter = KomikAdapter(data)
    }

    private fun filterList(category: CharCategory) {
        val data = generateDataList()
        val filteredList = data.filter {
            it.kategori == category
        }
        binding.rvDataList.adapter = KomikAdapter(filteredList)
        if (filteredList.isEmpty()) {
            Toast.makeText(requireContext(), "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
        }
    }



}