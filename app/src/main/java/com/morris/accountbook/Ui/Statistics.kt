package com.morris.accountbook.Ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.morris.accountbook.R

class Statistics : Fragment() {
    override fun onCreateView(inflater:LayoutInflater, container:ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreate(savedInstanceState)

        return inflater.inflate(R.layout.fragment_statistics,container,false)
    }
}