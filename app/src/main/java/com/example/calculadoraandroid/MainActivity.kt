package com.example.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pantalla
        val screen: TextView = findViewById(R.id.pantalla)
        val delete = findViewById<Button>(R.id.AC)

        //operaciones
        val suma = findViewById<Button>(R.id.mas)
        val resta = findViewById<Button>(R.id.menos)
        val multiplicacion = findViewById<Button>(R.id.multiplicacion)
        val division = findViewById<Button>(R.id.division)
        val sqrt = findViewById<Button>(R.id.raiz)
        val igual = findViewById<Button>(R.id.igual)
        val exponencial = findViewById<Button>(R.id.exponencial)

        //numeros
        val one = findViewById<Button>(R.id.uno)
        val two = findViewById<Button>(R.id.dos)
        val three = findViewById<Button>(R.id.tres)
        val four = findViewById<Button>(R.id.cuatro)
        val five = findViewById<Button>(R.id.cinco)
        val six = findViewById<Button>(R.id.seis)
        val seven = findViewById<Button>(R.id.siete)
        val eight = findViewById<Button>(R.id.ocho)
        val nine = findViewById<Button>(R.id.nueve)
        val zero = findViewById<Button>(R.id.cero)

        var operation = ""
        var res: Double

        one.setOnClickListener{ screen.text = screen.text.toString()+"1" }
        two.setOnClickListener{ screen.text = screen.text.toString()+"2" }
        three.setOnClickListener{ screen.text = screen.text.toString()+"3" }
        four.setOnClickListener{ screen.text = screen.text.toString()+"4" }
        five.setOnClickListener{ screen.text = screen.text.toString()+"5" }
        six.setOnClickListener{ screen.text = screen.text.toString()+"6" }
        seven.setOnClickListener{ screen.text = screen.text.toString()+"7" }
        eight.setOnClickListener{ screen.text = screen.text.toString()+"8" }
        nine.setOnClickListener{ screen.text = screen.text.toString()+"9" }
        zero.setOnClickListener{ screen.text = screen.text.toString()+"0" }

        suma.setOnClickListener{
            operation = "+"
            screen.text = screen.text.toString()+"+"
        }

        resta.setOnClickListener{
            operation = "-"
            screen.text = screen.text.toString()+"-"
        }

        multiplicacion.setOnClickListener{
            operation = "*"
            screen.text = screen.text.toString()+"*"
        }

        division.setOnClickListener{
            operation = "/"
            screen.text = screen.text.toString()+"/"
        }

        sqrt.setOnClickListener{
            operation = "√"
            screen.text = screen.text.toString()+"√"
        }

        exponencial.setOnClickListener{
            operation = "²"
            screen.text = screen.text.toString()+"²"
        }

        delete.setOnClickListener {
            operation = "AC"
            screen.text = ""
            res= 0.0
        }

        igual.setOnClickListener{
            val arr = screen.text.toString().split(operation)
            when (operation) {
                "+" -> {res = arr[0].toDouble() + arr[1].toDouble()
                    screen.text = res.toString()}

                "-" -> {res = arr[0].toDouble() - arr[1].toDouble()
                    screen.text = res.toString()}

                "*" -> {res = arr[0].toDouble() * arr[1].toDouble()
                    screen.text = res.toString()}

                "/" -> {res = arr[0].toDouble() / arr[1].toDouble()
                    screen.text = res.toString()}

                "²" -> {res = arr[0].toDouble().pow(2.0)
                    screen.text = res.toString()}

                "√" -> {res = sqrt(arr[1].toDouble())
                    screen.text = res.toString()}

                else -> screen.text = "ERROR"
            }
        }


    }
}

