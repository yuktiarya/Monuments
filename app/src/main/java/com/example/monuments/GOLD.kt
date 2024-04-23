package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GOLD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gold)


        val click=findViewById<Button>(R.id.goldinfo)
        val bock=findViewById<Button>(R.id.goldbtn)

        click.setOnClickListener {
            val uri= Uri.parse("https://en.wikipedia.org/wiki/Golden_Temple")
            intent= Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        bock.setOnClickListener {
            val uri= Uri.parse("https://asi.payumoney.com/")
        }
    }
}