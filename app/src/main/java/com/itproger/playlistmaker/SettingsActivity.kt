package com.itproger.playlistmaker

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val viewBack = findViewById<View>(R.id.imageButtonBack)

        val settingsContainer = findViewById<View>(R.id.activity_settings)
        hideSystemBar(settingsContainer, window)

        viewBack.setOnClickListener{
            finish()
        }

    }
    override fun onClick(v: View?) {

    }
}