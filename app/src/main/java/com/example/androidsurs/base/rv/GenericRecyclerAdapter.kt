package com.example.androidsurs.base.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class GenericRecyclerAdapter<T>(var items: ArrayList<T>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    abstract fun bind(item: T, holder: ViewHolder)

    fun update(items: ArrayList<T>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.count()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(viewType, parent, false)
        return ViewHolder(view)
    }

    fun getListPosition(position: Int): T {
        return items[position]
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        bind(items[position], holder as ViewHolder)
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}