package com.example.tugas2_operasihitung

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.view.View


class MainActivity : AppCompatActivity() {
    private val splashTime: Long = 3000 // 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Beralih ke Calculator.kt setelah 3 detik
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToCalculator()
        }, splashTime)

        // Beralih ke Calculator.kt jika layar diklik
        findViewById<View>(R.id.main).setOnClickListener {
            navigateToCalculator()
        }
    }

    private fun navigateToCalculator() {
        // Mulai Activity Calculator
        val intent = Intent(this, Calculator::class.java)
        startActivity(intent)
        finish() // Menutup MainActivity sehingga pengguna tidak dapat kembali ke splash screen
    }
}