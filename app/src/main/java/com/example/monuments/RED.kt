package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RED : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ram)

        val click=findViewById<Button>(R.id.linkbtn)
        val bock=findViewById<Button>(R.id.bockingbtn)

        click.setOnClickListener {
            val uri= Uri.parse("https://indiaculture.gov.in/red-fort-complex")
            intent= Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        bock.setOnClickListener {
            val uri=Uri.parse("https://asi.payumoney.com/")
        }
    }
}