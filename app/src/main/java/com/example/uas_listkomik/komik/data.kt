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