package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.unitconverterapp.databinding.ActivityMainBinding
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnrestart.setOnClickListener {
            binding.Input.text = "0"
            binding.Output.text = "0"
        }
        binding.btnClear.setOnClickListener {
            binding.Input.text = ""
        }
//        setting button to display
        binding.btn7.setOnClickListener {
            binding.Input.text = addInput("7")
            binding.Output.text = getResult().toString()
        }
        binding.btn8.setOnClickListener {
            binding.Input.text = addInput("8")
            binding.Output.text = getResult().toString()
        }
        binding.btn9.setOnClickListener {
            binding.Input.text = addInput("9")
            binding.Output.text = getResult().toString()
        }
        binding.btn4.setOnClickListener {
            binding.Input.text = addInput("4")
            binding.Output.text = getResult().toString()
        }
        binding.btn5.setOnClickListener {
            binding.Input.text = addInput("5")
            binding.Output.text = getResult().toString()
        }
        binding.btn6.setOnClickListener {
            binding.Input.text = addInput("6")
            binding.Output.text = getResult().toString()
        }
        binding.btn1.setOnClickListener {
            binding.Input.text = addInput("1")
            binding.Output.text = getResult().toString()
        }
        binding.btn2.setOnClickListener {
            binding.Input.text = addInput("2")
            binding.Output.text = getResult().toString()
        }
        binding.btn3.setOnClickListener {
            binding.Input.text = addInput("3")
            binding.Output.text = getResult().toString()
        }
        binding.btn00.setOnClickListener {
            binding.Input.text = addInput("00")
            binding.Output.text = getResult().toString()
        }
        binding.btn0.setOnClickListener {
            binding.Input.text = addInput("0")
            binding.Output.text = getResult().toString()
        }
        binding.btndot.setOnClickListener {
            binding.Input.text = addInput(".")
        }

        binding.btnrestart.setOnClickListener {
            var inputtext = binding.Input.text
            if (inputtext.isNotEmpty()) {
                inputtext.toString().dropLast(inputtext.lastIndex)
            }

        }

    }

    private fun addInput(buttonValue: String): String {
        return "${binding.Input.text}$buttonValue"
    }

    private fun getResult(): Double {
        val inputText = binding.Input.text.toString().toDouble()
        return if (inputText == null || inputText == 0.0) {

            roundOffDecimal(0.0)
        } else {
            var result = inputText * 3.28084
            roundOffDecimal(result)
        }
    }

    private fun roundOffDecimal(number: Double): Double {
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING
        return df.format(number).toDouble()
    }


}






