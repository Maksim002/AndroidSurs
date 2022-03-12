package com.example.androidsurs.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.navigation.Navigation
import com.example.androidsurs.R
import com.example.androidsurs.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_gallery.*


class GalleryFragment: BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    private fun initClick() {
        wdwd.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.webViewFragment)
        }
    }
}