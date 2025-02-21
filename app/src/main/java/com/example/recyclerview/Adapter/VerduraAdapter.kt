package com.example.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Data.Verdura
import com.example.recyclerview.databinding.ItemVerduraBinding

class VerduresAdapter(val VerduresList: MutableList<Verdura>) :
    RecyclerView.Adapter<VerduresAdapter.VerduresVh>() {
    class VerduresVh(private val binding: ItemVerduraBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {
        companion object {
            fun crear(parent: ViewGroup): VerduresVh {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemVerduraBinding.inflate(layoutInflater, parent, false)
                return VerduresVh(binding)
            }
        }

        fun emplenar(verdures: Verdura) {
            binding.tvnom.text = verdures.nom
            binding.tvcolor.text = verdures.color
            binding.tvtipus.text = verdures.tipus
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerduresVh {
        return VerduresVh.crear(parent)
    }

    override fun getItemCount(): Int = VerduresList.size

    override fun onBindViewHolder(holder: VerduresVh, position: Int) {
        holder.emplenar(VerduresList[position])
    }
}