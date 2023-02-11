package com.example.assignment12.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.assignment12.R

class TechnologyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technology)
        val androidCardView: CardView = findViewById(R.id.cardview_android)
        val frontendCardView: CardView = findViewById(R.id.cardview_frontend)
        val backendCardView: CardView = findViewById(R.id.cardview_backend)
        val fullstackCardView: CardView = findViewById(R.id.cardview_fullstack)
        val ethicalCardView: CardView = findViewById(R.id.cardview_ethicalhacking)
        val blockchainCardView: CardView = findViewById(R.id.cardview_blockchain)
        val buttonCallUs: Button = findViewById(R.id.btn_CallUs)
        androidCardView.setOnClickListener {
         val intent=Intent(this, AndroidActivity::class.java)
            startActivity(intent)
        }
        frontendCardView.setOnClickListener {
            val intent=Intent(this, FrontendActivity::class.java)
            startActivity(intent)
        }
        backendCardView.setOnClickListener {
            val intent=Intent(this, BackendActivity::class.java)
            startActivity(intent)
        }
        blockchainCardView.setOnClickListener {
            val intent=Intent(this, BlockchainActivity::class.java)
            startActivity(intent)
        }
        fullstackCardView.setOnClickListener {
            val intent=Intent(this, FullstackActivity::class.java)
            startActivity(intent)
        }
        ethicalCardView.setOnClickListener {
            val intent=Intent(this, EthicalhackingActivity::class.java)
            startActivity(intent)
        }
        buttonCallUs.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:123456789")
            startActivity(intent)
        }
    }
}