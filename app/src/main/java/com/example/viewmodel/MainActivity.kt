package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.viewmodel.view.PasswordCheck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, PasswordCheck() )
                .commit()
        }
    }
}