package com.example.tugas2_operasihitung

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Menerima data dari Intent
        val hasil = intent.getStringExtra("EXTRA_HASIL")

        //Menampilkan TextView hasil dan set nilai hasil
        val hasilTextView = findViewById<TextView>(R.id.hasil)
        hasilTextView.text = hasil

        val btnBack = findViewById<Button>(R.id.btn_kembali)

        // Set OnClickListener untuk tombol Back
        btnBack.setOnClickListener {
            // Buat Intent untuk kembali ke CalculatorActivity
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
            finish() // Tutup ResultActivity
        }

    }
}
