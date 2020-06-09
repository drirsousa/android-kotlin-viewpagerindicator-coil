package br.com.rosait.viewpagerindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    companion object {
        val imagesList = listOf("https://mobirise.com/bootstrap-carousel/assets2/images/thomas-smith-399133-1707x2560.jpg"
            ,"https://i.pinimg.com/originals/72/27/3a/72273a3107412cea88a6046f640861af.jpg"
            ,"https://25.media.tumblr.com/tumblr_mcxdwe4jqC1rbhz1oo1_500.jpg")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this, imagesList)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val dotsIndicator = findViewById<TabLayout>(R.id.dotsIndicator)

        viewPager.adapter = adapter
        dotsIndicator.setupWithViewPager(viewPager)
    }
}
