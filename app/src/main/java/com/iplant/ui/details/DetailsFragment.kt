package com.iplant.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.iplant.R
import com.iplant.database.PlantEntity
import com.iplant.databinding.FragmentDetailsBinding
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.ui.adapters.setImageUrl
import com.iplant.utils.logD

class DetailsFragment : Fragment() {

    private val detailsViewModel: DetailsViewModel by viewModels { DetailsViewModelFactory(args) }
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details, container, false
        )


        detailsViewModel.plantRequestSuccess.observe(viewLifecycleOwner, { plantResult ->
            if (plantResult != null){
                binding.plantData = plantResult.data
                binding.synonyms = plantResult.data?.mainSpecies?.synonyms?.map { it.name }.toString()
            }
        })

        detailsViewModel.plantRequest(args.plantSlug)

        detailsViewModel.plantEntity.observe(viewLifecycleOwner, { plantEntity ->
            if (plantEntity != null)
                binding.plantEntity = plantEntity
            else
                binding.plantEntity = PlantEntity(args.plantSlug, false, "")
        })

        binding.imageViewFavorite.setOnClickListener {
            binding.plantEntity?.let {
                it.isFavorite = !it.isFavorite
                detailsViewModel.insertPlantEntity(it)
            }
        }

        return binding.root
    }
}