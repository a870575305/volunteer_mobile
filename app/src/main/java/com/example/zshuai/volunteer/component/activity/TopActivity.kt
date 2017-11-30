package com.example.zshuai.volunteer.component.activity

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import android.view.ViewGroup
import android.view.Window
import android.widget.LinearLayout
import com.example.zshuai.volunteer.R
import com.example.zshuai.volunteer.base.BaseActivity
import com.example.zshuai.volunteer.component.fragment.TopFragment
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : BaseActivity() {
    lateinit var fragmentTransaction: FragmentTransaction
    private lateinit var actionToobarToggle: ActionBarDrawerToggle
    var topFragment: TopFragment = TopFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_top)
        initView()

        fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_content, topFragment, "TopFragment")
        fragmentTransaction.commit()
    }


    private fun initView() {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        actionToobarToggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.drawer_open, R.string.drawer_close)
        actionToobarToggle.syncState()
        drawer_layout.addDrawerListener(actionToobarToggle)
    }

}
