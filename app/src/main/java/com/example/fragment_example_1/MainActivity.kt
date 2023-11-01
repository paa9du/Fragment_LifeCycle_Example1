package com.example.fragment_example_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1Btn=findViewById<Button>(R.id.fragment1Btn)
        val fragment2Btn=findViewById<Button>(R.id.fragment2Btn)

      //  replaceFragment(BlankFragment1())

        fragment1Btn.setOnClickListener {
            replaceFragment(BlankFragment1())
        }

        fragment2Btn.setOnClickListener {
            replaceFragment(BlankFragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container,fragment)
            .commit()

    }
}