package com.example.alertdialogbox

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage(R.string.des)
            dialog.setIcon(R.drawable.baseline_auto_delete_24)

            dialog.setPositiveButton("YES"){
                dialogInterface,which->
                Toast.makeText(this,"Clicked Yes✔️",Toast.LENGTH_SHORT).show()
            }

            dialog.setNegativeButton("NO"){
                dialogInterface,which->
                Toast.makeText(this,"Clicked No❌",Toast.LENGTH_SHORT).show()
            }

            dialog.setNeutralButton("Cancel"){
                dialogInterface,which->
                Toast.makeText(this,"Clicked Cancel",Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog=dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}