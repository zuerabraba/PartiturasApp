package com.associacao.partiturasapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddPartituraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_partitura)

        val edtTitulo: EditText = findViewById(R.id.edtTitulo)
        val edtCompositor: EditText = findViewById(R.id.edtCompositor)
        val edtInstrumento: EditText = findViewById(R.id.edtInstrumento)
        val btnSalvar: Button = findViewById(R.id.btnSalvar)

        btnSalvar.setOnClickListener {
            val partitura = Partitura(
                titulo = edtTitulo.text.toString(),
                compositor = edtCompositor.text.toString(),
                instrumento = edtInstrumento.text.toString(),
                arquivoUrl = ""
            )
            FirebaseService.addPartitura(partitura) { sucesso ->
                if (sucesso) {
                    Toast.makeText(this, "Partitura adicionada!", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this, "Erro ao adicionar.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
