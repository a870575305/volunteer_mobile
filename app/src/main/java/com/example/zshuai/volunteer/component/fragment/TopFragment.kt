package com.example.zshuai.volunteer.component.fragment

import android.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.zshuai.volunteer.R
import com.example.zshuai.volunteer.base.BaseApp
import com.example.zshuai.volunteer.component.adapter.TopListAdapter
import com.example.zshuai.volunteer.data.TopListData
import com.example.zshuai.volunteer.util.GlideImageLoader
import com.youth.banner.Transformer
import kotlinx.android.synthetic.main.fragment_top.view.*
import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by wei on 2017/11/29.
 */
class TopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.fragment_top, container, false)
        initBanner(view)
        val margin = ViewGroup.MarginLayoutParams(view.layoutParams)
        val layoutParams = LinearLayout.LayoutParams(margin)
        layoutParams.width = (activity.application as BaseApp).width
        layoutParams.height = ((activity.application as BaseApp).height * 0.3).toInt()
        view.banner.layoutParams = layoutParams

        var data=TopListData("東京湾を泳げるようにするイベント","2017/11/10~2018/03/08","東京都","")
        var data2=TopListData("坂本竜馬像　銅像差し替え（2件）","2017/11/10~2018/03/08","高知県","")
        var listData=ArrayList<TopListData>()
        listData.add(data)
        listData.add(data2)
        view.top_campaign_lv.adapter=TopListAdapter(listData,activity)

        return view
    }

    private fun initBanner(view: View) {
        view.banner.setImageLoader(GlideImageLoader())
        view.banner.isAutoPlay(true)
        // 広告の変化の時間の設定
        view.banner.setDelayTime(4000)
        // 広告の変化のアニメの設定
        view.banner.setBannerAnimation(Transformer.DepthPage)
        val images = ArrayList<Int>()
        // 写真のデータを入れる
        images.add(R.mipmap.images)
        images.add(R.mipmap.images2)
        images.add(R.mipmap.images3)
        images.add(R.mipmap.images4)
        view.banner.setImages(images)
        // banner（ボランティアの広告のUI）を開始
        view.banner.start()
    }
}