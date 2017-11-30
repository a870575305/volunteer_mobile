package com.example.zshuai.volunteer.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.zshuai.volunteer.component.dialog.LoaddingDialog

/**
 * Created by wei on 2017/11/28.
 */
open class BaseActivity : AppCompatActivity() {
    private val TAG = "wX"
    private var loadding: LoaddingDialog = LoaddingDialog()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun BaseActivity.log(log: String) {
        try {
            Log.e(TAG, log)
        } catch (e: Exception) {
//            e.stackTrace
            Log.e(TAG, e.message)
        }
    }

    fun BaseActivity.showLoad() {
        Log.e("wx", "showLoad")
        if (loadding == null) {
            Log.e("wx", "showLoad.loadding=null")
            loadding = LoaddingDialog()
        }
        loadding.show(supportFragmentManager, "load")
    }

    fun BaseActivity.closeLoad() {
        if (loadding != null) {
            loadding.dismiss()
        }
    }

    /**
     * 显示Toast
     * @param msg: 要显示的信息
     * @param time：要显示的时间，不设定时显示为默认多时间
     *
     */
    fun BaseActivity.showToast(msg: String, time: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, msg, time).show()
    }


    fun BaseActivity.setSharedPreferences(context: Context, spName: String, key: String, value: Int) {
        val et = context.getSharedPreferences(spName, Context.MODE_PRIVATE).edit()
        et.putInt(key, value)
        et.apply()
    }

    fun BaseActivity.setSharedPreferences(context: Context, spName: String, key: String, value: String) {
        val et = context.getSharedPreferences(spName, Context.MODE_PRIVATE).edit()
        et.putString(key, value)
        et.apply()
    }

    fun BaseActivity.setSharedPreferences(context: Context, spName: String, key: String, value: Boolean) {
        val et = context.getSharedPreferences(spName, Context.MODE_PRIVATE).edit()
        et.putBoolean(key, value)
        et.apply()
    }

    fun BaseActivity.getSharedPreferences(context: Context, spName: String, key: String, defaultValue: Int): Int {
        val sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE)
        return sp.getInt(key, defaultValue)
    }

    fun BaseActivity.getSharedPreferences(context: Context, spName: String, key: String, defaultValue: String): String {
        val sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE)
        return sp.getString(key, defaultValue)
    }

    fun BaseActivity.getSharedPreferences(context: Context, spName: String, key: String, defaultValue: Boolean): Boolean {
        val sp = context.getSharedPreferences(spName, Context.MODE_PRIVATE)
        return sp.getBoolean(key, defaultValue)
    }




}