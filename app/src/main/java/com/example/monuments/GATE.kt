package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GATE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gate)

        val click=findViewById<Button>(R.id.gateinfo)
        val bock=findViewById<Button>(R.id.gatebtn)

        click.setOnClickListener {
            val uri= Uri.parse("https://en.wikipedia.org/wiki/Gateway_of_India#Design_and_architecture")
            intent= Intent(Intent.ACTION_VIEW,uri)
                    startActivity(intent)
        }
        bock.setOnClickListener {
            val uri= Uri.parse("https://asi.payumoney.com/")
                }
    }
}

