package com.example.monuments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class mean_monument_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mean_monument_page)

        val ram=findViewById<ImageView>(R.id.Ram_Man)
        val red=findViewById<ImageView>(R.id.Red_Fort)
        val gold=findViewById<ImageView>(R.id.Golden)
        val gate=findViewById<ImageView>(R.id.Gateway)
        val haw=findViewById<ImageView>(R.id.Hawa)

        ram.setOnClickListener {
            intent= Intent(applicationContext,RAM::class.java)
            startActivity(intent)
        }

        red.setOnClickListener {
            intent=Intent(applicationContext,RED::class.java)
            startActivity(intent)
        }

        haw.setOnClickListener {
            intent=Intent(applicationContext,HAWA::class.java)
            startActivity(intent)
        }

        gold.setOnClickListener {
            intent=Intent(applicationContext,GOLD::class.java)
            startActivity(intent)
        }

        gate.setOnClickListener {
            intent=Intent(applicationContext,GATE::class.java)
            startActivity(intent)
        }
    }
}