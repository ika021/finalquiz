package com.example.finalquiz


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView = findViewById<BottomNavigationView>(R.id.botNavView)
        val controller = findNavController(R.id.nav_host_fragment)
        val appConfig = AppBarConfiguration(setOf(
            R.id.homeFragment,
            R.id.userFragment


        ))
        setupActionBarWithNavController(controller, appConfig)
        navView.setupWithNavController(controller)

    }
}