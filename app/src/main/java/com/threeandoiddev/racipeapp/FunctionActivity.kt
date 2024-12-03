package com.threeandoiddev.racipeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_function)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.function)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val budgetfriendlybutton = findViewById<LinearLayout>(R.id.budget_friendly)
        val deliverybutton = findViewById<LinearLayout>(R.id.delivery_service)
        val imagesearchbutton = findViewById<LinearLayout>(R.id.image_search)

        budgetfriendlybutton.setOnClickListener{
            val intent = Intent(this, BudgetFriendly::class.java )
            startActivity(intent)
        }

        deliverybutton.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.doordash.com/"))
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("FunctionActivity", "Error launching browser: ${e.message}")
            }
        }
        imagesearchbutton.setOnClickListener {
            val intent = Intent(this, ImageSearchActivity::class.java)
            startActivity(intent)
        }
    }
}