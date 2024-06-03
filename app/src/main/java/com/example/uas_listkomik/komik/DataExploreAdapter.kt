package com.example.uas_listkomik.komik

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.   view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.uas_listkomik.R
import com.example.uas_listkomik.databinding.LayoutDataKomikBinding

class DataExploreAdapter (private var dataKomik: List<dataList>):     // 1 ( buat data class dataList )
    RecyclerView.Adapter<DataExploreAdapter.KomikViewHolder>() {    //    (buat ViewHolder : KomikViewHolder))

    // 2 membuat data class di data.kt
    class KomikViewHolder(val binding: LayoutDataKomikBinding) :
        RecyclerView.ViewHolder(binding.root)  // 3

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KomikViewHolder {        // CTRL + o = pilih 3 yaitu onCreate, getItemCount, onBind
        val binding =
            LayoutDataKomikBinding.inflate(LayoutInflater.from(parent.context), parent, false)  // 4
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

class DataExploreAdapter(private var dataKomik: List<dataList>) : RecyclerView.Adapter<DataExploreAdapter.KomikViewHolder>() {

    class KomikViewHolder(val binding: LayoutDataKomikBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivGambarKomik: ImageView = binding.ivGambarKomik
        val tvNamaKomik: TextView = binding.tvNamaKomik
        val ivAsalKomik: ImageView = binding.ivAsalKomik
        val ivStar: ImageView = binding.ivStar
        val tvRating: TextView = binding.tvRating
        val tvDescription: TextView = binding.tvDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomikViewHolder {
        val binding = LayoutDataKomikBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KomikViewHolder(binding)
    }

    override fun onBindViewHolder(holder: KomikViewHolder, position: Int) {
        val data = dataKomik[position]
        holder.ivGambarKomik.setImageResource(data.gambar)
        holder.tvNamaKomik.text = data.nama
        holder.ivAsalKomik.setImageResource(data.asal)
        holder.ivStar.setImageResource(data.star)
        holder.tvRating.text = data.rating
        holder.tvDescription.text = data.description
    }

    override fun getItemCount(): Int {
        return dataKomik.size
    }
}