package com.example.zshuai.volunteer.component.dialog

import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import com.example.zshuai.volunteer.R


/**
 * loadding画面
 * Created by wei on 2017/11/29.
 */
class LoaddingDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity.layoutInflater
        val view = inflater.inflate(R.layout.dialog_loadding, null)
        builder.setView(view)
        return builder.create()
    }
}