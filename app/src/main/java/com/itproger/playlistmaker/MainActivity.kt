package com.itproger.playlistmaker

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val image = findViewById<Button>(R.id.imageButtonSettings)
        val displayIntent = Intent(this, SettingsActivity::class.java)
        val imageClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                startActivity(displayIntent)
            }
        }


        val mainContainer = findViewById<View>(R.id.activity_main)
        hideSystemBar(mainContainer, window)

        image.setOnClickListener(imageClickListener)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.imageButtonLibrary -> {
                val displayIntent = Intent(this, LibraryActivity::class.java)
                startActivity(displayIntent)
            }
            R.id.imageButtonSearch -> {
                val displayIntent = Intent(this, SearchActivity::class.java)
                startActivity(displayIntent)
            }
        }
    }
}