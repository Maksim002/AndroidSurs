package com.example.androidsurs.ui.gallery

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidsurs.R
import com.example.androidsurs.base.BaseFragment
import com.example.androidsurs.models.GalleryModel
import com.example.androidsurs.ui.gallery.rv.GalleryAdapter
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
        initRecyclerView()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun initRecyclerView() {
        val adapters = GalleryAdapter(object : GalleryAdapter.Listener{
            override fun setOnClickListener(position: Int) {
                when(position){
                    0 -> Navigation.findNavController(view!!).navigate(R.id.webViewFragment)
                    1 -> Navigation.findNavController(view!!).navigate(R.id.scrollFragment)
                }
            }
        })

        val list: ArrayList<GalleryModel> = arrayListOf()
        list.add(GalleryModel("Installing Android", R.drawable.ic_installing))
        list.add(GalleryModel("Scroll View", R.drawable.ic_scroll_view))

        adapters.update(list)
        recyclerView.adapter = adapters
    }
}