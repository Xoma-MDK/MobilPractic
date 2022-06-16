package com.example.mobilpractic

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class cinema : AppCompatActivity() {
    var tvInfo: TextView? = null
    var tvName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinema)
        tvInfo = findViewById(R.id.tvInfo);
        tvName = findViewById(R.id.editTextTextPersonName);
    }
}