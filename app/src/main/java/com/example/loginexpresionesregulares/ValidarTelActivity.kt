package com.example.loginexpresionesregulares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class ValidarTelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validar_tel)

    }

    fun validarTelefono(view: View): Boolean {
        var txtTelefono:  EditText
        txtTelefono = findViewById(R.id.txtTelefono)
        val patron = Pattern.compile("^\\d{10}\$")
        val matcher = patron.matcher(txtTelefono.text.toString())
        return matcher.matches()
    }

    fun validacion(view: View) {
        var txtTelefono:  EditText
        txtTelefono = findViewById(R.id.txtTelefono)
        if (validarTelefono(txtTelefono)) {
            Toast.makeText(this, "El numero de telefono es valido",Toast.LENGTH_LONG).show()
            //println("El número de teléfono es válido.")
        } else {
            Toast.makeText(this, "El numero de telefono no es valido", Toast.LENGTH_LONG).show()
            //println("El número de teléfono no es válido.")
        }
    }
}