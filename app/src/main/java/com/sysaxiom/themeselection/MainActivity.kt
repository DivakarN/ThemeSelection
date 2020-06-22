package com.sysaxiom.themeselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Oncreate Called")

        default_mode.setOnClickListener {
            ThemeHelper.applyTheme(ThemeHelper.default)
        }

        day_mode.setOnClickListener {
            ThemeHelper.applyTheme(ThemeHelper.lightMode)
        }

        night_mode.setOnClickListener {
            ThemeHelper.applyTheme(ThemeHelper.darkMode)
        }

        battery_saver_mode.setOnClickListener {
            ThemeHelper.applyTheme(ThemeHelper.batterySaverMode)
        }

    }
}
