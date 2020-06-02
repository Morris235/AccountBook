package com.morris.accountbook.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.morris.accountbook.R
import kotlinx.android.synthetic.main.activity_main.view.*

// 예제 어댑터 구현 : http://dudmy.net/android/2019/03/02/try-viewpager2-simply/
//class PagerRecyclerAdapter (private val bgColors: List<Int>) :
//    RecyclerView.Adapter<PagerViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder = PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_pager,parent,false))
//
//    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
//        holder.bind(bgColors[position],position)
//    }
//
//    override fun getItemCount(): Int = bgColors.size
//}
//class PagerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
//
//    private val textView : TextView = itemView.findViewById(R.id.MainViewPager)
//
//    fun bind(@ColorRes bgColors: Int,position: Int) {
//        textView.text = "RecyclerViewAdapter\nPage $position"
//        itemView.setBackgroundColor(ContextCompat.getColor(itemView.context, bgColors))
//    }
//}