package com.example.menuappbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    fun home(item: android.view.MenuItem) {

      var b= Intent(this,Home::class.java)
        startActivity(b)

    }
    fun help(item: android.view.MenuItem) {
        var b=  Intent(this,Help::class.java)
        startActivity(b)
    }
    fun name(item: android.view.MenuItem) {
        var b=   Intent(this,Name::class.java)
        startActivity(b)
    }
}