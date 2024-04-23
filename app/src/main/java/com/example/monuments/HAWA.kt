package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HAWA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hawa)


        val click=findViewById<Button>(R.id.hawainfo)
        val bock=findViewById<Button>(R.id.hawabtn)

        click.setOnClickListener {
            val uri= Uri.parse("https://en.wikipedia.org/wiki/Hawa_Mahal")
            intent= Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        bock.setOnClickListener {
            val uri= Uri.parse("https://asi.payumoney.com/")
        }
    }
}