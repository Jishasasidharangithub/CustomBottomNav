package com.fpt.fragment


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fragmentManager: FragmentActivity) : FragmentStateAdapter(fragmentManager) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FragmentHome()
            1 -> FragmentFavorite()
            2 -> FragmentUser()
            else -> throw java.lang.IllegalArgumentException("Invalid position")
        }
    }
}
