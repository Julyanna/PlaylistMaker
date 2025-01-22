package com.itproger.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val settingsContainer = findViewById<View>(R.id.activity_settings)
        hideSystemBar(settingsContainer, window)

        settingsContainer.findViewById<Toolbar>(R.id.settingsToolbar).apply {

            setNavigationOnClickListener {
                finish()
            }
        }

    }

}