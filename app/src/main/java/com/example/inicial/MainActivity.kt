package com.example.inicial

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Acessar o elemento de elemento de tela
        val imgLogin = findViewById<ImageView>(R.id.imgLogin)
        // Modificando a imagem
        imgLogin.setImageResource(R.drawable.unicid)

        val btnConectar = findViewById<Button>(R.id.btnConectar)
        btnConectar.setText("Login")

        btnConectar.setOnClickListener {
            val edtUsername = findViewById<EditText>(R.id.edtUsername)
            val edtPassword = findViewById<EditText>(R.id.edtPassword)
            val credenciais: String = "Usuário: "+edtUsername.text+" Senha: "+edtPassword.text

            Toast.makeText(getApplicationContext(), credenciais, Toast.LENGTH_LONG).show()
        }

        val btnFechar = findViewById<Button>(R.id.btnFechar)
        btnFechar.setOnClickListener {
            finish();
        }

    }
}