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