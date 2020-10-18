//Abdelrahman Tealab
//301164103

package com.example.abdelrahmantealab_mapd711_assignment2_pizzaonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text
import kotlin.math.exp

class CheckingOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
    }

    fun submitPressed(view: View){
        //when submit button or (ORDER) button is pressed, i do a simple validity check
        //to make sure that all the fields have input in them, otherwise a feedback
        //will be provided for the user to enforce them to fill in the fields.

        var fullName:EditText = findViewById(R.id.fullName)
        var streetAddress:EditText = findViewById(R.id.streetAddress)
        var postalCode:EditText = findViewById(R.id.postalCode)
        var phoneNumber:EditText = findViewById(R.id.phoneNumber)
        var creditCard:EditText = findViewById(R.id.creditCard)
        var cardType:EditText = findViewById(R.id.cardType)
        var expiryDate:EditText = findViewById(R.id.expiryDate)

        //i used Toasts and Hints to tell the user which field needs attention
        if (fullName.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "fullname is empty!", Toast.LENGTH_SHORT)
            toast.show()
            fullName.hint="Please enter a Fullname"
        }
        if (streetAddress.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "street address is empty!", Toast.LENGTH_SHORT)
            toast.show()
            streetAddress.hint="Please enter an address"
        }
        if (postalCode.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "postal code is empty!", Toast.LENGTH_SHORT)
            toast.show()
            postalCode.hint="Please enter a postal code"
        }
        if (phoneNumber.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "phone number is empty!", Toast.LENGTH_SHORT)
            toast.show()
            phoneNumber.hint="Please enter a phone number"
        }
        if (creditCard.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "credit card is empty!", Toast.LENGTH_SHORT)
            toast.show()
            creditCard.hint="Please enter a credit card"
        }
        if (cardType.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "card type is empty!", Toast.LENGTH_SHORT)
            toast.show()
            cardType.hint="Please enter a card type"
        }
        if (expiryDate.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "expiry date is empty!", Toast.LENGTH_SHORT)
            toast.show()
            expiryDate.hint="Please enter an expiry date"
        }
        if (!fullName.text.isEmpty() && !streetAddress.text.isEmpty() && !postalCode.text.isEmpty() && !phoneNumber.text.isEmpty() && !creditCard.text.isEmpty() && !cardType.text.isEmpty() && !expiryDate.text.isEmpty()){
            val toast = Toast.makeText(applicationContext, "congrats!!", Toast.LENGTH_SHORT)
            toast.show()

            //when everything is valid, i pass on the variables that i need for the next screen which will be
            //pizza size, type, toppings, and also from this activity, fullname and address so they can be displayed
            //in the final screen
            val pizzaSize = intent.extras?.getString("pizzaSize")
            val pizzaType = intent.extras?.getString("pizzaType")
            val myToppings = intent.extras?.getStringArrayList("myToppings")


            val intent3 = Intent(this, Displaying::class.java).apply {
                putStringArrayListExtra("myToppings",myToppings)
                putExtra("pizzaSize",pizzaSize)
                putExtra("pizzaType",pizzaType)
                putExtra("fullName",fullName.text.toString())
                putExtra("streetAddress",streetAddress.text.toString())
            }
            startActivity(intent3)
        }
    }
}