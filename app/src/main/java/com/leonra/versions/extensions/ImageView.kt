package com.leonra.versions.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.leonra.versions.R

/**
 * Convenience wrapper around [Glide]'s url image loading.
 */
fun ImageView.load(imageUrl: String) =
    Glide.with(context)
        .load(imageUrl)
        .placeholder(R.drawable.image_placeholder)
        .fallback(R.drawable.image_placeholder)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)
