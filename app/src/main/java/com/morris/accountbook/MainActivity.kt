package com.morris.accountbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.morris.accountbook.Ui.Camera
import com.morris.accountbook.Ui.Home
import com.morris.accountbook.Ui.Statistics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
//            val fragment = Home()
            supportFragmentManager.beginTransaction().replace(R.id.frame_layout,Home()).commit()
        }

        bottomNavigationView.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.homeBtn -> {supportFragmentManager.beginTransaction().replace(R.id.frame_layout,Home()).commit()
//                    bottomNavigationView.itemIconTintList=null
                    return@setOnNavigationItemSelectedListener true}
                R.id.cameraBtn -> {supportFragmentManager.beginTransaction().replace(R.id.frame_layout, Camera()).commit()
//                    bottomNavigationView.itemIconTintList=null
                    return@setOnNavigationItemSelectedListener true}
                R.id.donutBtn -> {supportFragmentManager.beginTransaction().replace(R.id.frame_layout, Statistics()).commit()
//                    bottomNavigationView.itemIconTintList=null
                    return@setOnNavigationItemSelectedListener true}

                else -> {true}
            }
        }



    }
}
