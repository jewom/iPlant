package com.iplant.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.iplant.R
import com.iplant.databinding.FragmentDetailsBinding
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.ui.adapters.setImageUrl
import com.iplant.utils.logD

class DetailsFragment : Fragment() {

    private lateinit var detailsViewModel: DetailsViewModel
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailsViewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

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

        return binding.root
    }
}