//Abdelrahman Tealab
//301164103

package com.example.abdelrahmantealab_mapd711_assignment2_pizzaonline

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toppings.*

class ToppingsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toppings)

        //over here in the toppings page i capture the variables from
        //the previous activity and store them so i can display it
        //nicely on the title of the activity and also pass it
        //to next activities
        val pizzaSize = intent.extras?.getString("pizzaSize")
        val pizzaType = intent.extras?.getString("pizzaType")

        val pizzaTitle: TextView = findViewById(R.id.pizzaTitle)
        pizzaTitle.setText(pizzaSize + " " + pizzaType)

    }

    fun checkOutPressed(view: View){
        //when check out button is pressed, i store the text of the checkboxes
        //into an array only if they are checked so i can pass them on
        //to the next activity

        val cheese: CheckBox = findViewById(R.id.cheese)
        val greenPepper: CheckBox = findViewById(R.id.greenPepper)
        val smokedHam: CheckBox = findViewById(R.id.smokedHam)
        val spinach: CheckBox = findViewById(R.id.spinach)
        val blackOlives: CheckBox = findViewById(R.id.blackOlives)
        val spanishOnions: CheckBox = findViewById(R.id.spanishOnions)
        val availableToppings = arrayOf(cheese,greenPepper,smokedHam,spinach,blackOlives,spanishOnions)

        val myToppings: ArrayList<String> = ArrayList()
        val pizzaSize = intent.extras?.getString("pizzaSize")
        val pizzaType = intent.extras?.getString("pizzaType")

        for (topping in availableToppings){
            if (topping.isChecked){
                myToppings.add(topping.text.toString())
            }
        }

        //here i pass the pizza type, size, and toppings array to the next activity
        val intent2 = Intent(this, CheckingOut::class.java).apply {
            putStringArrayListExtra("myToppings",myToppings)
            putExtra("pizzaSize",pizzaSize)
            putExtra("pizzaType",pizzaType)
        }
        startActivity(intent2)
    }
}