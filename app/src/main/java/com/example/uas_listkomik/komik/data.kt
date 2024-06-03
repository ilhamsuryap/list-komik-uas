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
    data.add(dataList(CharCategory.MANHWA,R.drawable.mercenary, "Mercenary Enrollment", R.drawable.korean, R.drawable.star4, "9.10"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.nanomachine, "Nano Machine", R.drawable.korean, R.drawable.star4, "8.54"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.resource, "Return of the Frozen Player", R.drawable.korean, R.drawable.star4, "7.98"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.killerpeter, "Killer Peter", R.drawable.korean, R.drawable.star3, "7.00"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.descent, "The Descent of the  Demonic Master", R.drawable.korean, R.drawable.star4, "8.26"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.dungeon, "Dungeon Reset", R.drawable.korean, R.drawable.star4, "8.45"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.secondlife, "Ranker Who Lives a Second Time", R.drawable.korean, R.drawable.star4, "8.83"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.executioner, "Executioner", R.drawable.korean, R.drawable.star3, "6.93"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.omniscient, "Omniscient Reader's Viewpoint", R.drawable.korean, R.drawable.star4, "9.17"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.northern, "Legend of the Northern Blade", R.drawable.korean, R.drawable.star4, "9.08"))
    data.add(dataList(CharCategory.MANHWA,R.drawable.eleceed, "Eleceed", R.drawable.korean, R.drawable.star4, "8.89"))
    data.add(dataList(CharCategory.MANGA,R.drawable.icelord, "Ice Lord", R.drawable.jepang, R.drawable.star3, "7.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.holy, "Holy Emperor's", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.over, "Otherworldly Sword", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.renkarnasi, "Reincarnations", R.drawable.jepang, R.drawable.star4, "9.0"))
    data.add(dataList(CharCategory.MANGA,R.drawable.kaijuu, "8Kaijuu", R.drawable.jepang, R.drawable.star4, "9.11"))
    data.add(dataList(CharCategory.MANGA,R.drawable.legend, "Legend", R.drawable.jepang, R.drawable.star3, "7.49"))
    data.add(dataList(CharCategory.MANGA,R.drawable.kagurabachi, "Kagurabachi", R.drawable.jepang, R.drawable.star3, "7.42"))
    data.add(dataList(CharCategory.MANGA,R.drawable.bluelock, "Blue Lock", R.drawable.jepang, R.drawable.star4, "8.89"))
    data.add(dataList(CharCategory.MANGA,R.drawable.onepiece, "One Piece", R.drawable.jepang, R.drawable.star4, "9.33"))
    data.add(dataList(CharCategory.MANGA,R.drawable.onepunch, "One Punch-Man", R.drawable.jepang, R.drawable.star4, "9.29"))
    data.add(dataList(CharCategory.MANGA,R.drawable.killblue, "Kill Blue", R.drawable.jepang, R.drawable.star3, "7.37"))
    data.add(dataList(CharCategory.MANGA,R.drawable.gachiakuta, "Gachiakuta", R.drawable.jepang, R.drawable.star3, "7.89"))
    data.add(dataList(CharCategory.MANGA,R.drawable.tatari, "Tatari", R.drawable.jepang, R.drawable.star3, "7.63"))
    data.add(dataList(CharCategory.MANGA,R.drawable.vinland, "Vinland Saga", R.drawable.jepang, R.drawable.star4, "9.17"))
    data.add(dataList(CharCategory.MANGA,R.drawable.kokuma, "Kokuma Mosou", R.drawable.jepang, R.drawable.star3, "7.29"))
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