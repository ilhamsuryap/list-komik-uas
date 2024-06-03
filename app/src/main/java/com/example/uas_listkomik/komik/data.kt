package com.example.uas_listkomik.komik

import com.example.uas_listkomik.R

data class dataList(val kategori: CharCategory,
                    val gambar : Int,
                    val nama : String,
                    val asal : Int,
                    val star : Int,
                    val rating : String)
enum class CharCategory {
    MANHWA,
    MANGA
}
fun generateDataList(): MutableList<dataList> {
    val data = mutableListOf<dataList>()
    data.add(dataList(CharCategory.MANHWA,R.drawable.lookism, "Lookism", R.drawable.korean, R.drawable.star5, "10.0" ))
    data.add(dataList(CharCategory.MANHWA,R.drawable.htf, "How To Fight", R.drawable.korean, R.drawable.star5, "10.0"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.managerkim, "Manager Kim", R.drawable.korean, R.drawable.star4, "10.0"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.sololeveling, "Solo Leveling", R.drawable.korean, R.drawable.star4, "10.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.holy, "Holy Emperor's", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.over, "Otherworldly Sword", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
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
data class dataList(val kategori: CharCategory,
                    val gambar : Int,
                    val nama : String,
                    val asal : Int,
                    val star : Int,
                    val rating : String,
                    val description: String)
fun generateDataList(): MutableList<dataList> {
    val data = mutableListOf<dataList>()
    data.add(dataList(CharCategory.MANHWA,R.drawable.lookism, "Lookism", R.drawable.korean, R.drawable.star5, "10.0", "Deskripsi looksim" ))
    data.add(dataList(CharCategory.MANHWA,R.drawable.htf, "How To Fight", R.drawable.korean, R.drawable.star5, "10.0", "Deskripsi how to fight"))
    return data
}