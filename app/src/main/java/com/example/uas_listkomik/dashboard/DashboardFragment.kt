package com.example.uas_listkomik.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uas_listkomik.R
import com.example.uas_listkomik.databinding.FragmentDashboardBinding
import com.example.uas_listkomik.databinding.FragmentHomeBinding
import com.example.uas_listkomik.komik.CharCategory
import com.example.uas_listkomik.komik.KomikAdapter
import com.example.uas_listkomik.komik.generateDataList

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


//    binding.manhwa.setOnClickListener {
//        filterList(CharCategory.MANHWA) // Panggil filterList dengan kategori MANHWA
//    }
//    binding.manga.setOnClickListener {
//        filterList(CharCategory.MANGA) // Panggil filterList dengan kategori MANGA
//    }

//    private fun filterList(category: CharCategory) {
//        val data = generateDataList()
//        val filteredList = data.filter {
//            it.kategori == category
//        }
//        binding.rvDataList.adapter = KomikAdapter(filteredList)
//        if (filteredList.isEmpty()) {
//            Toast.makeText(requireContext(), "Data tidak ditemukan", Toast.LENGTH_SHORT).show()
//        }
//    }
}
