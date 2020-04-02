package com.example.pemrograman_android

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    //Menambahkan item fragment pada tab
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment.newInstance()
        } else if (position == 1) {
            SecondFragment.newInstance()
        } else {
            ThirdFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        //Memberi nama tab sesuai pada IntArray TAB_TITLES
        return mContext.resources.getString(TAB_TITLES[position])
    }

    //Jumlah tab fragment
    override fun getCount(): Int {
        return 3
    }

    companion object {
        @StringRes
        //Memasukkan value pada resources string ke IntArray TAB_TITLES
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3
        )
    }
}
