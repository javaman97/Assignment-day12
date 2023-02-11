package com.example.assignment12.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.assignment12.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLetGO: Button =findViewById(R.id.btn_letsGo)
        buttonLetGO.setOnClickListener {
            Toast.makeText(this,"Journey Started",Toast.LENGTH_SHORT).show()
            val intent= Intent(this, TechnologyActivity::class.java)
            startActivity(intent)
        }
    }
}