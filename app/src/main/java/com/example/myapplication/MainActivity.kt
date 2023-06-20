package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener{
            val nome = binding.editNome.text.toString().trim()
            val sNome = binding.editSobrenome.text.toString().trim()

            if(nome.isEmpty() || sNome.isEmpty()){
                binding.textResultado.text = "Nome não inserido."
                Toast.makeText(applicationContext,"Nome não inserido", Toast.LENGTH_SHORT).show()
            }else{
                binding.textResultado.text = "Olá, $nome $sNome"
                Toast.makeText(applicationContext,"Olá, $nome $sNome", Toast.LENGTH_LONG).show()
            }
        }
    }
}