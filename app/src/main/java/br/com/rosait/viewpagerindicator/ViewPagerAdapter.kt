package br.com.rosait.viewpagerindicator

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import coil.api.load

class ViewPagerAdapter (val context: Context, val listImagePath: List<String>) : PagerAdapter() {
    override fun isViewFromObject(view: View, _object: Any): Boolean {
        return view == _object
    }

    override fun getCount(): Int {
        return listImagePath.size
    }

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val image = ImageView(context)

        image.load(listImagePath[position])

        image.scaleType = ImageView.ScaleType.CENTER_CROP

        collection.addView(image)

        return image
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }
}