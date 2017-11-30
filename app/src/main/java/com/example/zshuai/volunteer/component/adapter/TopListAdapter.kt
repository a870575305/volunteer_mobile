package com.example.zshuai.volunteer.component.adapter

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.zshuai.volunteer.R
import com.example.zshuai.volunteer.data.TopListData
import com.squareup.picasso.Picasso
import org.jetbrains.anko.image
import org.jetbrains.anko.layoutInflater

/**
 * Created by wei on 2017/11/30.
 */
class TopListAdapter(var topData: List<TopListData>,
                     var context: Context) : BaseAdapter() {

    var mData: List<TopListData>? = null
    var mInflater: LayoutInflater? = null

    init {
        Log.e("wx", "TopListAdapter.init")
        mData = topData
        mInflater = LayoutInflater.from(context)
    }


    override fun getItem(position: Int): Any {
        Log.e("wx", "TopListAdapter.getItem")
        return mData!![position]
    }

    override fun getItemId(position: Int): Long {
        Log.e("wx", "TopListAdapter.getItemId")
        return position.toLong()
    }

    override fun getCount(): Int {
        Log.e("wx", "TopListAdapter.getCount")
        return mData!!.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) =
            convertView ?: createView(parent!!).apply {
                Log.e("wx", "TopListAdapter.apply")
                with(tag as TopViewHolder) {
                    with(getItem(position)) {
                        title.text = mData!![position].title
                        time.text = mData!![position].time
                        place.text = mData!![position].place
                        icon.setBackgroundResource(R.mipmap.ca_agriculture)
                    }
                }
            }


    private inner class TopViewHolder(item: ViewGroup) {
        internal val title: TextView = item.findViewById(R.id.list_item_title)
        internal val time: TextView = item.findViewById(R.id.list_item_time)
        internal val place: TextView = item.findViewById(R.id.list_item_place)
        internal val icon: ImageView = item.findViewById(R.id.list_item_icon)
    }

    private fun createView(parent: ViewGroup) =
            (parent.context.layoutInflater.inflate(R.layout.top_list_item, parent, false) as ViewGroup).apply {
                Log.e("wx", "TopListAdapter.apply")
                tag = TopViewHolder(this)
            }
}