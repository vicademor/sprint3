package com.example.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.DrawableRes
import com.example.sprint3.databinding.ViewMyCardBinding
import com.google.android.material.card.MaterialCardView

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = com.google.android.material.R.attr.materialCardViewStyle
) : MaterialCardView(context, attrs, defStyleAttr) {

    val binding = ViewMyCardBinding.inflate(LayoutInflater.from(context), this, true)

    fun setTitle(title: CharSequence?) {
        binding.tvCardTitle.text = title
    }

    fun setSubtitle(subtitle: CharSequence?) {
        binding.tvCardSubtitle.text = subtitle
    }

    fun setDescription(description: CharSequence?) {
        binding.tvCardDescription.text = description
    }

    fun setImageResource(@DrawableRes resId: Int, contentDescription: String? = null) {
        binding.ivCardImage.setImageResource(resId)
        binding.ivCardImage.contentDescription = contentDescription
    }
}
