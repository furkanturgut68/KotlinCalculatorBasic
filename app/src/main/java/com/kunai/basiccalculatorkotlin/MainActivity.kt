package com.kunai.basiccalculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.kunai.basiccalculatorkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number1 : Int? = null
    var number2 : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonSum.setOnClickListener(View.OnClickListener {
            mySum()
        })

        binding.buttonSubt.setOnClickListener(View.OnClickListener {
            mySubt()
        })

        binding.buttonDivide.setOnClickListener(View.OnClickListener {
            myDivide()
        })

        binding.buttonMultiply.setOnClickListener(View.OnClickListener {
            myMultiply()
        })

    }

    private fun myMultiply() {
        number1 = binding.editNumber1.text.toString().toIntOrNull()
        number2 = binding.editNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.textResult.text = "Geçersiz değer"
        }else {
            binding.textResult.text = "Sonuç: ${number1!! * number2!!}"
        }
    }

    private fun myDivide() {
        number1 = binding.editNumber1.text.toString().toIntOrNull()
        number2 = binding.editNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.textResult.text = "Geçersiz değer"
        }else {
            binding.textResult.text = "Sonuç: ${number1!! / number2!!}"
        }
    }

    private fun mySubt() {
        number1 = binding.editNumber1.text.toString().toIntOrNull()
        number2 = binding.editNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.textResult.text = "Geçersiz değer"
        }else {
            binding.textResult.text = "Sonuç: ${number1!! - number2!!}"
        }
    }

    fun mySum(){
        number1 = binding.editNumber1.text.toString().toIntOrNull()
        number2 = binding.editNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            binding.textResult.text = "Geçersiz değer"
        }else {
            binding.textResult.text = "Sonuç: ${number1!! + number2!!}"
        }
    }


}

