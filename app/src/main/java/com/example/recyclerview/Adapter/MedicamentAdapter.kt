package com.example.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Data.Medicament
import com.example.recyclerview.Data.Verdura
import com.example.recyclerview.databinding.ItemMedicamentBinding
import com.example.recyclerview.databinding.ItemVerduraBinding

class MedicamentAdapter(val VerduresList: MutableList<Medicament>) : RecyclerView.Adapter<MedicamentAdapter.MedicamentVH>() {
    class MedicamentVH(private val binding: ItemMedicamentBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {
        companion object {
            fun crear(parent: ViewGroup): MedicamentVH {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemMedicamentBinding.inflate(layoutInflater, parent, false)
                return MedicamentVH(binding)
            }
        }

        fun emplenar(medicament: Medicament) {
            binding.tvnom.text = medicament.nom
            binding.tvdescripcio.text = medicament.id.toString()
            binding.tvtipus.text = medicament.tipus
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicamentVH {
        return MedicamentVH.crear(parent)
    }

    override fun getItemCount(): Int = VerduresList.size

    override fun onBindViewHolder(holder: MedicamentVH, position: Int) {
        holder.emplenar(VerduresList[position])
    }
}