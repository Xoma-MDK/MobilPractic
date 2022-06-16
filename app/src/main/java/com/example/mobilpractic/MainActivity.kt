package com.example.mobilpractic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        // добавляем пункты меню
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var intent: Intent? = null
        intent = when (item.getItemId()) {
            R.id.m1 -> Intent(this, cinema::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}