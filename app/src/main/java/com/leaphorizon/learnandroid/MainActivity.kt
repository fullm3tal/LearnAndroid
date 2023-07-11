package com.leaphorizon.learnandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.atwa.filepicker.core.FilePicker
import com.leaphorizon.toaster.Toaster

class MainActivity : AppCompatActivity() {

    private val filePicker = FilePicker.getInstance(this)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvClickNotification).setOnClickListener {
            pickImage()
        }
        findViewById<TextView>(R.id.tvDisplayToast).setOnClickListener {
            Toaster.displayToast("This is a sample toast for testing", this, Toast.LENGTH_SHORT)
        }
    }
    private fun pickImage() {
        filePicker.pickImage {
        }
    }

}