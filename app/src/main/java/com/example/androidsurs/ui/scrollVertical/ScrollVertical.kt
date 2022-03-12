package com.example.androidsurs.ui.scrollVertical

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidsurs.R
import com.example.androidsurs.base.BaseFragment

class ScrollVertical : BaseFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_scroll_vertical, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSupportNavigateUp()
    }

    fun onSupportNavigateUp()
            = Navigation.findNavController(requireActivity(), R.id.my_nav_com_fragment).navigateUp()
}