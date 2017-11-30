package com.example.zshuai.volunteer.base

import android.app.Activity
import android.app.Application
import android.util.Log

/**
 * Created by wei on 2017/11/28.
 */
open class BaseApp : Application() {
    // スマホの幅
    var width: Int = 0
    // スマホの高さ
    var height: Int = 0

    private var activityList: ArrayList<Activity> = ArrayList()

    override fun onCreate() {
        super.onCreate()
        Log.e("wx", "BaseApp.onCreate")
        getWindowSize()
    }

    public fun addActivity(activity: Activity) {
        activityList.add(activity)
    }

    public fun removeActivity(activity: Activity) {
        Log.e("wx", "BaseApp.removeActivity")
        if (activity in activityList) {
            val isOK = activityList.remove(activity)
            Log.e("wx", "BaseApp.removeActivity:" + isOK)
        }
    }

    public fun finishAllActivity() {
        activityList
                .filterNot { it.isFinishing }
                .forEach {
                    Log.e("wx", "finishAllActivity:" + it.localClassName)
                    it.finish()
                }
    }

    /**
     * 获取屏幕尺寸
     */
    private fun getWindowSize() {
        Log.i("wx", "BaseActivity.getWindowSize")
        val dm = resources.displayMetrics
        width = dm.widthPixels
        height = dm.heightPixels
        Log.i("wx", "BaseActivity.getWindowSize.width:" + width)
        Log.i("wx", "BaseActivity.getWindowSize.height:" + height)
    }


    fun savaLog() {

    }

    fun netIsOK() {

    }

}