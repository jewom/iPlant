package com.iplant.ui.adapters

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.iplant.AppNavigationDirections
import com.iplant.utils.logD
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun setImageUrl(view: ImageView, imageUrl: String?) {
    imageUrl?.let { Picasso.get().load(it).into(view) }
}

@BindingAdapter("onClickForDetails")
fun setOnClickListenerForDetails(
        view: View,
        plantSlug: String,
) {
    view.setOnClickListener {
        val navDirections = AppNavigationDirections.actionGlobalDetailsFragment(plantSlug = plantSlug)
        Navigation.findNavController(view).navigate(navDirections)
    }
}
