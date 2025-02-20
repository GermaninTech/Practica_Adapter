package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Adapter.VerduresAdapter
import com.example.recyclerview.Data.Verdura
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        val verduraList:MutableList<Verdura> = mutableListOf(
            Verdura("Zanahoria", "Naranja", "Raíz"),
            Verdura("Lechuga", "Verde", "Hoja"),
            Verdura("Tomate", "Rojo", "Fruto"),
            Verdura("Pepino", "Verde", "Fruto"),
            Verdura("Cebolla", "Blanco", "Bulbo"),
            Verdura("Berenjena", "Morado", "Fruto"),
            Verdura("Espinaca", "Verde", "Hoja"),
            Verdura("Brócoli", "Verde", "Flor"),
            Verdura("Coliflor", "Blanco", "Flor"),
            Verdura("Pimiento", "Rojo", "Fruto")
        )
        val verduraAdapter = VerduresAdapter(verduraList)
        binding.RVverdura.adapter = verduraAdapter
        binding.RVverdura.layoutManager = LinearLayoutManager(this)

    }

}

