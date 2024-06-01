package com.example.uas_listkomik.komik

import com.example.uas_listkomik.R

data class dataList(val kategori: CharCategory, var gambar : Int, val nama : String)
enum class CharCategory {
    MANHWA,
    MANGA
}
fun generateDataList(): MutableList<dataList> {
    val data = mutableListOf<dataList>()
    data.add(dataList(CharCategory.MANHWA,R.drawable.lookism, "Lookism"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.htf, "How To Fight"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.managerkim, "Manager Kim"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.sololeveling, "Solo Leveling"))
    data.add(dataList(CharCategory.MANGA,R.drawable.holy, "Holy Emperor's"))
    data.add(dataList(CharCategory.MANGA,R.drawable.over, "Otherworldly Sword"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations"))
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