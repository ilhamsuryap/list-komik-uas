package com.example.uas_listkomik.komik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.   view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.uas_listkomik.R
import com.example.uas_listkomik.databinding.LayoutDataKomikBinding

class KomikAdapter (private var dataKomik: List<dataList>):     // 1 ( buat data class dataList )
    RecyclerView.Adapter<KomikAdapter.KomikViewHolder>(){    //    (buat ViewHolder : KomikViewHolder))

    // 2 membuat data class di data.kt
    class KomikViewHolder(val binding: LayoutDataKomikBinding) :RecyclerView.ViewHolder(binding.root)  // 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomikViewHolder {        // CTRL + o = pilih 3 yaitu onCreate, getItemCount, onBind
        val binding = LayoutDataKomikBinding.inflate(LayoutInflater.from(parent.context), parent,false)  // 4
        return KomikViewHolder(binding)
    }

    override fun getItemCount(): Int {  // 5
        return dataKomik.size
    }
    override fun onBindViewHolder(holder: KomikViewHolder, position: Int) {  // 6
        val data = dataKomik[position]
        holder.binding.ivGambarKomik.setImageResource(data.gambar)
        holder.binding.tvNamaKomik.text = data.nama
        holder.binding.ivAsalKomik.setImageResource(data.asal)
        holder.binding.ivStar.setImageResource(data.star)
        holder.binding.tvRating.text = data.rating
    }


}

class AdapterKelompok(
    private val dataKelompok: List<kelompok>,
    private val context: Context,
    private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<AdapterKelompok.KelompokViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(item: kelompok)
    }

    // ViewHolder untuk memanggil id dari data yang akan ditampilkan
    class KelompokViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val ivMhs: ImageView = row.findViewById(R.id.ivGambar)
        val tvNamaMhs: TextView = row.findViewById(R.id.tvNamaListMHS)
        val btnDetail: View = row.findViewById(R.id.btnDetail)
    }

    // Untuk menampilkan data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelompokViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.layout_profile, parent, false)
        return KelompokViewHolder(layout)
    }

    // Untuk membatasi jumlah data yang akan ditampilkan
    override fun getItemCount(): Int {
        return dataKelompok.size
    }

    // Data yang akan ditampilkan
    override fun onBindViewHolder(holder: KelompokViewHolder, position: Int) {
        val mahasiswa = dataKelompok[position]
        holder.tvNamaMhs.text = mahasiswa.nama
        val resourceId = context.resources.getIdentifier(mahasiswa.gambar, "drawable", context.packageName)
        if (resourceId != 0) {
            holder.ivMhs.setImageResource(resourceId)
        } else {
            // Menangani kasus jika sumber daya tidak ditemukan
            holder.ivMhs.setImageResource(R.drawable.logo) // Pastikan Anda memiliki gambar default
        }

        holder.btnDetail.setOnClickListener {
            itemClickListener.onItemClick(mahasiswa)
        }
    }
}