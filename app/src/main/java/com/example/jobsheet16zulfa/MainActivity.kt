package com.example.jobsheet16zulfa

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol1 = findViewById<Button>(R.id.tomboldialog1)
        val btn2 = findViewById<Button>(R.id.tomboldialog2)
        val biodata = arrayOf("ZULFA SOFIANA.", "XI PPLG 2", "3039")

        tombol1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Judul")
                .setMessage("ZULFA SOFIANA/XI pplg 2/3039")
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Tombol Yes Ditekan", Toast.LENGTH_SHORT).show()
                })
                .show()
        }

        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialog = inflater.inflate(R.layout.activity_dialog2, null)
            val editText = dialog.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama")
                .setView(dialog)
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(
                            this,
                            "Nama kamu " + editText.getText().toString(),
                            Toast.LENGTH_SHORT
                        ).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }).show()
        }
    }
}