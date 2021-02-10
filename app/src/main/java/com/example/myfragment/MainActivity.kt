package com.example.myfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFg = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.mainFrame, welcomeFg)
            commit()
        }
    }
}