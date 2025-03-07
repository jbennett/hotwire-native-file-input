package com.example.myapplication

import android.os.Bundle
import dev.hotwire.navigation.activities.HotwireActivity
import dev.hotwire.navigation.navigator.NavigatorConfiguration

class MainActivity : HotwireActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun navigatorConfigurations() = listOf(
        NavigatorConfiguration(
            name = "main",
            startLocation = "https://harmonious-yummy-grandiflora.glitch.me",
            navigatorHostId = R.id.main_nav_host
        )
    )
}