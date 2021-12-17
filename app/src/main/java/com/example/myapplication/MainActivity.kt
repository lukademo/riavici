package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navigation = findViewById<BottomNavigationView>(R.id.bottomNavMenu)


        val controller = findNavController(R.id.nav_host_fragment_container)


        var appBarConfiguration = AppBarConfiguration(
            setOf(R.layout.fragment_blank,
                  R.layout.fragment_blank2,
                  R.layout.fragment_blank3)
        )

        setupActionBarWithNavController(controller,appBarConfiguration)
        navigation.setupWithNavController(controller)

















    }
}