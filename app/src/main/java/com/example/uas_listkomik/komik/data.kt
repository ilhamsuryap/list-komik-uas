package com.example.uas_listkomik.komik

import com.example.uas_listkomik.R

data class dataList(var kategori: String, var gambar : Int, val nama : String)
fun generateDataList(): MutableList<dataList> {
    val data = mutableListOf<dataList>()
    data.add(dataList("MAHNWA",R.drawable.lookism, "Lookism"))
    data.add(dataList("MAHNWA",R.drawable.htf, "How To Fight"))
    data.add(dataList("MAHNWA",R.drawable.managerkim, "Manager Kim"))
    data.add(dataList("MAHNWA",R.drawable.sololeveling, "Solo Leveling"))
    data.add(dataList("MANGA",R.drawable.holy, "Holy Emperor's Grandsons is a"))
    data.add(dataList("MANGA",R.drawable.over, "Otherworldly Sword King's Survival Record"))
    data.add(dataList("MANGA",R.drawable.renkarnasi, "Reincarnations of the Swordmaster"))
    data.add(dataList("MANGA",R.drawable.renkarnasi, "Reincarnations of the Swordmaster"))
    data.add(dataList("MANGA",R.drawable.renkarnasi, "Reincarnations of the Swordmaster"))
    return data
}

data class kelompok(
    val gambar: String,
    val nama:String,
    val nim:String,
    val ttl: String,
    val alamat: String,
    val prodi : String
    )
class ListKelompok {
    fun dataKelompok():MutableList<kelompok>{
        val mahasiswa = mutableListOf<kelompok>()
        mahasiswa.add(kelompok("java","Ilham Suryaputra", "233307103/2D", "Ngawi, 23 Mei 2005", "Ngawi", "Teknologi Informasi"))
        mahasiswa.add(kelompok("java","Muhammad Miftahul Karim", "233307109/2D", "Tulungagung, 28 Oktober 2004", "Tulungagung", "Teknologi Informasi"))
        mahasiswa.add(kelompok("java","Umi Latifah", "233307117/2D", "Magetan, 15 Agustus 2005", "Magetan", "Teknologi Informasi"))
        mahasiswa.add(kelompok("java","Nanik Mugi Rahayu", "233307109/2D", "Tulungagung, 28 Oktober 2004", "Tulungagung", "Teknologi Informasi"))
        return mahasiswa
    }
}