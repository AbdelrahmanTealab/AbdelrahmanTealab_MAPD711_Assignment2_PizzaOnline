package com.example.abdelrahmantealab_mapd711_assignment2_pizzaonline

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Displaying : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val pizzaSize = intent.extras?.getString("pizzaSize")
        val pizzaType = intent.extras?.getString("pizzaType")
        val myToppings = intent.extras?.getStringArrayList("myToppings")
        val fullName = intent.extras?.getString("fullName")
        val streetAddress = intent.extras?.getString("streetAddress")

        var customerName:TextView = findViewById(R.id.customerName)
        var typeOfPizza:TextView = findViewById(R.id.typeOfPizza)
        var sizeOfPizza:TextView = findViewById(R.id.sizeOfPizza)
        var customerAddress:TextView = findViewById(R.id.customerAddress)
        var toppingDis:TextView = findViewById(R.id.toppingDis)

        customerName.setText(fullName)
        typeOfPizza.setText(pizzaType)
        sizeOfPizza.setText(pizzaSize)
        customerAddress.setText(streetAddress)

        for (topping in myToppings!!)
        {
            toppingDis.append(topping)
            if (topping != myToppings.last()){
                toppingDis.append(",")
            }
        }
    }

    fun homePressed(view: View){
        val intent4 = Intent(this, MainActivity::class.java)
        startActivity(intent4)
    }
}