package com.example.weatherapp.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class HomeAdapter(supportFragmentManager: FragmentManager):FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)  {
    private val mFragmentList = ArrayList<Fragment>()
    private  val mFragmentTitleList = ArrayList<String>()
    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }
    fun addFragment(fragment: Fragment,title:String){
        mFragmentTitleList.add(title)
        mFragmentList.add(fragment)
    }
}