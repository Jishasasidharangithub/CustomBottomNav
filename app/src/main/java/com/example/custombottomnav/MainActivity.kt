package com.example.custombottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.custombottomnav.databinding.ActivityMainBinding
import com.fpt.fragment.ViewPageAdapter

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.pagerMain?.adapter = ViewPageAdapter(this)

    }

}
