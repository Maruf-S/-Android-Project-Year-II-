package com.example.weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.weatherapp.fragments._5dayFragment
import com.example.weatherapp.fragments.adapters.HomeAdapter
import com.example.weatherapp.fragments.todayFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var viewpager_id:ViewPager
    lateinit var tabLayout_id:TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()//Remove the action bar
//       window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
        viewpager_id  = findViewById(R.id.viewpager_id);
        tabLayout_id  = findViewById(R.id.tabLayout_id)
        setUpTabs()
    }
    private fun setUpTabs(){
        val adapter = HomeAdapter(supportFragmentManager)
        adapter.addFragment(todayFragment(),title = "Today")
        adapter.addFragment(_5dayFragment(),title = "5-Day")
        viewpager_id.adapter = adapter
        tabLayout_id.setupWithViewPager(viewpager_id)
    }
}