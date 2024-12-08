package com.sotkou.bindingapp

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ClickHandlers(val context:Context) {

    fun displayClickMessage(view: View) {
        Toast.makeText(context, "You clicked the button!", Toast.LENGTH_SHORT).show()

    }
}