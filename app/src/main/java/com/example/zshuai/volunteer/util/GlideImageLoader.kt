package com.example.zshuai.volunteer.util

import android.content.Context
import android.util.Log
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.youth.banner.loader.ImageLoader

/**
 * Created by wei on 2017/11/30.
 */
class GlideImageLoader: ImageLoader() {
    init {
        Log.e("wx", "GlideImageLoader")
    }



    /**
     * 写真を設定された
     *
     * @param context
     * @param path      　写真のpath
     * @param imageView
     */
    override fun displayImage(context: Context, path: Any, imageView: ImageView) {

        imageView.scaleType = ImageView.ScaleType.FIT_XY
        // Picasso#withメソッドでデフォルト値が設定されたPicassoインスタンスを生成している。
        Picasso.with(context).load(path as Int).into(imageView)
    }
}