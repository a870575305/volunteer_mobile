package com.example.zshuai.volunteer.component.view

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by wei on 2017/11/29.
 */
class LoadView : View {
    var mPaint: Paint = Paint()
    var widthSpecSize: Int? = null
    var heightSpecSize: Int? = null
    var radius = 20//小圆球半径
    var HLength = 100 //六边形半径
    var maxMoveH = 60 //向外移送最长距离
    var moveH = 0 //向外移动增量
    var theCircle = -1
    lateinit var animator: ValueAnimator

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    fun start(){

    }

    fun stop(){

    }
}