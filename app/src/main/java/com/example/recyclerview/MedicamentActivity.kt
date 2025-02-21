package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Adapter.MedicamentAdapter
import com.example.recyclerview.Adapter.VerduresAdapter
import com.example.recyclerview.Data.Medicament
import com.example.recyclerview.Data.Verdura
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.ActivityMedicamentBinding

class MedicamentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicamentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicamentBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        val medicamentList: MutableList<Medicament> = mutableListOf(
            Medicament(1, "Naranja", "xarop","",23.4,2,),
            Medicament(2, "Verde", "Hoja","",10.2,1,),
            Medicament(3, "Rojo", "Fruto","",10.9,2,),
            Medicament(4, "Verde", "Fruto","",2.2,3,),
            Medicament(5, "Blanco", "Bulbo","",4.6,2),
            Medicament(6, "Morado", "Fruto","",7.9,2),
            Medicament(7, "Verde", "Hoja","",9.9,3),
            Medicament(8, "Verde", "Flor","",20.4,4),
            Medicament(9, "Blanco", "Flor","",10.5,3),
            Medicament(10, "Rojo", "Fruto","",11.0,2)
        )
        val MedicamentAdapter = MedicamentAdapter(medicamentList)
        binding.RVMedicaments.adapter = MedicamentAdapter
        binding.RVMedicaments.layoutManager = LinearLayoutManager(this)

    }

}

