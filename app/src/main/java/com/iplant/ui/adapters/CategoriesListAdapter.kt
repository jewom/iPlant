package com.iplant.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iplant.databinding.ItemPlantBinding
import com.iplant.models.search.Data
import com.iplant.utils.logD

class PlantsListAdapter() : ListAdapter<Data, RecyclerView.ViewHolder>(
    PlantDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CategoryViewHolder(ItemPlantBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        (holder as CategoryViewHolder).bind(getItem(position))

    inner class CategoryViewHolder(private val binding: ItemPlantBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(plant: Data) {
            binding.plant = plant
        }

    }

}

class PlantDiffCallback : DiffUtil.ItemCallback<Data>() {
    override fun areItemsTheSame(oldItem: Data, newItem: Data) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Data, newItem: Data) = oldItem.id == newItem.id
}