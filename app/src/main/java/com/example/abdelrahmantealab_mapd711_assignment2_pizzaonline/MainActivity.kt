package com.example.abdelrahmantealab_mapd711_assignment2_pizzaonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater:MenuInflater = getMenuInflater();
        inflater.inflate(R.menu.pizza_menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.meatSupreme -> {
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show();
                return true}
            R.id.superHawaiian -> {
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show();
                return true}
            R.id.veggie -> {
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show();
                return true}
            R.id.mediterranean -> {
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show();
                return true}
            R.id.cheddarSupreme -> {
                Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show();
                return true}
            else -> print("unknown y3m")
        }
        return super.onOptionsItemSelected(item)
    }
}