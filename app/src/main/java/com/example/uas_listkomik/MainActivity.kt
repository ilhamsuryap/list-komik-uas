package com.example.uas_listkomik

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.uas_listkomik.about.AboutFragment
import com.example.uas_listkomik.dashboard.DashboardFragment
import com.example.uas_listkomik.databinding.ActivityMainBinding
import com.example.uas_listkomik.home.HomeFragment
import com.example.uas_listkomik.komik.dataList
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeFragment : HomeFragment
    private lateinit var dashboardFragment : DashboardFragment
    private lateinit var aboutFragment : AboutFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeFragment = HomeFragment()
        dashboardFragment = DashboardFragment()
        aboutFragment = AboutFragment()

        loadFragment(homeFragment)

        binding.btnHome.setOnClickListener {
            loadFragment(homeFragment)
            return@setOnClickListener


        }
        binding.btnDashboard.setOnClickListener {
            loadFragment(dashboardFragment)
            return@setOnClickListener
        }
        binding.btnAbout.setOnClickListener {
            loadFragment(aboutFragment)
            return@setOnClickListener

        }

    }
    private fun loadFragment(fragment: Fragment){
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, fragment)
        transaction.commit()
    }

}