package com.example.sprint3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class OutlinedTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    override fun onDraw(canvas: Canvas) {
        val fillColor = currentTextColor

        //Dibuja el contorno dorado
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 6f
        setTextColor(Color.parseColor("#D4AF37"))
        super.onDraw(canvas)

        //Dibuja el relleno azul oscuro encima
        paint.style = Paint.Style.FILL
        setTextColor(fillColor)
        super.onDraw(canvas)
    }
}