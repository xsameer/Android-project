package com.example.login_page

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var uname: EditText? = null
    private var pwd: EditText? = null
    private var bReset: Button? = null
    private var bSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        uname = findViewById(R.id.editTextText)
        pwd = findViewById(R.id.editTextText2)
        bReset = findViewById(R.id.button)
        bSubmit = findViewById(R.id.button2)


        bSubmit?.setOnClickListener {
            val username = uname?.text.toString()
            val password = pwd?.text.toString()

            if (username == "Admin" && password == "123") {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
            }
        }


        bReset?.setOnClickListener {
            uname?.text?.clear()
            pwd?.text?.clear()
        }
    }
}
