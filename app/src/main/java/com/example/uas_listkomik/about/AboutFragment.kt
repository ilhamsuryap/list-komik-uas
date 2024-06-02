package com.example.uas_listkomik.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import com.example.uas_listkomik.R
import com.example.uas_listkomik.databinding.FragmentAboutBinding
import com.example.uas_listkomik.komik.AdapterKelompok
import com.example.uas_listkomik.komik.kelompok

class AboutFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val ARG_PARAM1 = null
            param1 = it.getString(ARG_PARAM1)
            val ARG_PARAM2 = null
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvKelompok.layoutManager = GridLayoutManager(context, 2)

        // Contoh data mahasiswa
        val list = listOf(
            kelompok("ilham","Ilham Suryaputra", "233307103/2D", "Ngawi, 23 Mei 2005", "Ngawi", "Teknologi Informasi"),
            kelompok("karim","Muhammad Miftahul Karim", "233307109/2D", "Tulungagung, 28 Oktober 2004", "Tulungagung", "Teknologi Informasi"),
            kelompok("umi","Umi Latifah", "233307117/2D", "Magetan, 15 Agustus 2005", "Magetan", "Teknologi Informasi"),
            kelompok("nanik","Nanik Mugi Rahayu", "2304307005", "Ketapang, 18 Mei 2004", "Ketapang", "Teknologi Informasi")
        )

        val adapter = AdapterKelompok(list, requireContext(), object : AdapterKelompok.OnItemClickListener {
            override fun onItemClick(item: kelompok) {
                showDetailData(item)
            }
        })
        binding.rvKelompok.adapter = adapter
    }

    private fun showDetailData(item: kelompok) {
        val popUpView = LayoutInflater.from(context).inflate(R.layout.pop_up, null)
        val detailGambar: ImageView = popUpView.findViewById(R.id.ivMHS)
        val detailNama: TextView = popUpView.findViewById(R.id.tvNamaMHS)
        val detailNim: TextView = popUpView.findViewById(R.id.tvNim)
        val detailTTL: TextView = popUpView.findViewById(R.id.tvTTLMHS)
        val detailAlamat: TextView = popUpView.findViewById(R.id.tvAlamatMHS)
        val detailProdi: TextView = popUpView.findViewById(R.id.tvNoHPMHS)
        val btnTutup: Button = popUpView.findViewById(R.id.btnTutup)

        val resourceId = resources.getIdentifier(item.gambar, "drawable", context?.packageName)
        if (resourceId != 0) {
            detailGambar.setImageResource(resourceId)
        } else {
            detailGambar.setImageResource(R.drawable.logo) // Pastikan Anda memiliki gambar default
        }

        detailNama.text = item.nama
        detailNim.text = item.nim
        detailTTL.text = item.ttl
        detailAlamat.text = item.alamat
        detailProdi.text = item.prodi

        val dialog = AlertDialog.Builder(requireContext())
            .setView(popUpView)
            .create()

        btnTutup.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    val ARG_PARAM1 = null
                    val ARG_PARAM2 = null
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
