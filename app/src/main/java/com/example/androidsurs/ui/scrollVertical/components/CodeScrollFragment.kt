package com.example.androidsurs.ui.scrollVertical.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidsurs.R
import com.example.androidsurs.base.BaseFragment
import com.pddstudio.highlightjs.models.Theme
import kotlinx.android.synthetic.main.fragment_code_scroll.*

class CodeScrollFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_code_scroll, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        highlightView.theme = Theme.ANDROID_STUDIO
        highlightView.highlightLanguage = com.pddstudio.highlightjs.models.Language.AUTO_DETECT
        highlightView.setSource("wdwdwd")

    }
}