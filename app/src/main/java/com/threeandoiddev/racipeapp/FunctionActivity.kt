package com.threeandoiddev.racipeapp

import android.content.Intent
import android.os.Bundle
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
            val intent = Intent(this ,BudgetFriendly::class.java)
            startActivity(intent)
        }

        deliverybutton.setOnClickListener {
            val intent = Intent(this, DeliveryActivity::class.java )
            startActivity(intent)
        }
        imagesearchbutton.setOnClickListener {
            val intent = Intent(this, ImageSearchActivity::class.java)
            startActivity(intent)
        }
    }
}