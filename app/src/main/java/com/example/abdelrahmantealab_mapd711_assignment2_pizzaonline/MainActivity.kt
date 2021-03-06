//Abdelrahman Tealab
//301164103

package com.example.abdelrahmantealab_mapd711_assignment2_pizzaonline

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //this is to create the menu on top right corner
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater:MenuInflater = getMenuInflater();
        inflater.inflate(R.menu.pizza_menu, menu)
        return true;
    }

    //this is the function that gets executed when an item is selected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        //i take the ID of the item and depending on what the item is then pass on the variables to the next activity
        when(item.itemId){

            R.id.smallMeatSupreme -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Meat Supreme")
                    putExtra("pizzaSize","Small")
                }
                startActivity(intent)
            }
            R.id.mediumMeatSupreme -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Meat Supreme")
                    putExtra("pizzaSize","Medium")
                }
                startActivity(intent)
            }
            R.id.largeMeatSupreme -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Meat Supreme")
                    putExtra("pizzaSize","Large")
                }
                startActivity(intent)
            }

            R.id.smallSuperHawaiian -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Super Hawaiian")
                    putExtra("pizzaSize","Small")
                }
                startActivity(intent)
            }
            R.id.mediumSuperHawaiian -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Super Hawaiian")
                    putExtra("pizzaSize","Medium")
                }
                startActivity(intent)
            }
            R.id.largeSuperHawaiian -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Super Hawaiian")
                    putExtra("pizzaSize","Large")
                }
                startActivity(intent)
            }

            R.id.smallVeggie -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Veggie")
                    putExtra("pizzaSize","Small")
                }
                startActivity(intent)
            }
            R.id.mediumVeggie -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Veggie")
                    putExtra("pizzaSize","Medium")
                }
                startActivity(intent)
            }
            R.id.largeVeggie -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Veggie")
                    putExtra("pizzaSize","Large")
                }
                startActivity(intent)
            }

            R.id.smallMediterranean -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Mediterranean")
                    putExtra("pizzaSize","Small")
                }
                startActivity(intent)
            }
            R.id.mediumMediterranean -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Mediterranean")
                    putExtra("pizzaSize","Medium")
                }
                startActivity(intent)
            }
            R.id.largeMediterranean -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Mediterranean")
                    putExtra("pizzaSize","Large")
                }
                startActivity(intent)
            }

            R.id.smallCheddar -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Cheddar Supreme")
                    putExtra("pizzaSize","Small")
                }
                startActivity(intent)
            }
            R.id.mediumCheddar -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Cheddar Supreme")
                    putExtra("pizzaSize","Medium")
                }
                startActivity(intent)
            }
            R.id.largeCheddar -> {
                val intent = Intent(this, ToppingsPage::class.java).apply {
                    putExtra("pizzaType","Cheddar Supreme")
                    putExtra("pizzaSize","Large")
                }
                startActivity(intent)
            }
            //this line is just for debugging
            else -> print("unknown")
        }
        return super.onOptionsItemSelected(item)
    }
}