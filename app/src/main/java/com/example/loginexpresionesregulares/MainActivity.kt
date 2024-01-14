package com.example.loginexpresionesregulares

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun validarContraseña(view: View) {
        val contraseñaEditText = findViewById<EditText>(R.id.txtpswd1)
        val contraseña = contraseñaEditText.text.toString()
        // Definir la expresión regular para validar la contraseña
        val patron = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}$")
        if (patron.matches(contraseña)) {
            Toast.makeText(this , "La contraseña es correcta " , Toast.LENGTH_LONG).show()
            Log.d("Validación", "La contraseña es válida.")
            // Opcionalmente, puedes mostrar el resultado en un TextView
            // val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)
            // resultadoTextView.text = "La contraseña es válida."
        } else {
            Toast.makeText(this , "La contraseña no es valida ", Toast.LENGTH_LONG).show()
            Log.d("Validación", "La contraseña no es válida.")

            // Opcionalmente, puedes mostrar el resultado en un TextView
            // val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)
            // resultadoTextView.text = "La contraseña no es válida."
        }
    }



    fun siguientebtn(view: View)  {
        val intent = Intent(this, ValidarTelActivity :: class.java)
        startActivity(intent);

    }




}