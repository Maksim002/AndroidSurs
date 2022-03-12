package com.example.androidsurs.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidsurs.utils.LoadingAlert

open class BaseFragment: Fragment() {
    lateinit var alertDialog: LoadingAlert

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        alertDialog = LoadingAlert(requireActivity())
    }
}