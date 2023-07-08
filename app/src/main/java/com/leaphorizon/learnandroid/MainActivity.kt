package com.leaphorizon.learnandroid

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.atwa.filepicker.core.FilePicker
import java.io.File

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

    fun pickImage() {
        filePicker.pickImage() { meta ->
        }
    }

}