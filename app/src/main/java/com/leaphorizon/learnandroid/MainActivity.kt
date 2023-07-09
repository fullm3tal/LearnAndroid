package com.leaphorizon.learnandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.atwa.filepicker.core.FilePicker

class MainActivity : AppCompatActivity() {

    private val filePicker = FilePicker.getInstance(this)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvClickNotification).setOnClickListener {
            pickImage()
        }
    }
    private fun pickImage() {
        filePicker.pickImage {
        }
    }

}