package com.example.monuments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed( {
            Toast.makeText(applicationContext,"Wait for seconds",Toast.LENGTH_LONG).show()
            val intent=Intent(this@MainActivity,mean_monument_Page::class.java)
            startActivity(intent)
            finish()

        },3000)

    }
}