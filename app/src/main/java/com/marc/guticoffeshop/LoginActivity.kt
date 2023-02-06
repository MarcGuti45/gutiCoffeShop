package com.marc.guticoffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonEntrar = findViewById<Button>(R.id.buttonEntrar)
        val buttonCrear = findViewById<Button>(R.id.buttonCrear)
        val nomAdmin = findViewById<EditText>(R.id.editTextNombre)
        val password = findViewById<EditText>(R.id.editTextContraseña)

        buttonEntrar.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        buttonCrear.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}