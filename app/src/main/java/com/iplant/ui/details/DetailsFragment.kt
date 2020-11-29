package com.iplant.ui.details

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Constraints
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.iplant.R
import com.iplant.database.PlantEntity
import com.iplant.databinding.DialogCommentBinding
import com.iplant.databinding.FragmentDetailsBinding
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.ui.adapters.setImageUrl
import com.iplant.utils.logD

class DetailsFragment : Fragment() {

    lateinit var binding: FragmentDetailsBinding
    private val detailsViewModel: DetailsViewModel by viewModels { DetailsViewModelFactory(args) }
    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
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

        binding.buttonComment.setOnClickListener {
            showCommentDialog()
        }

        return binding.root
    }

    private fun showCommentDialog(){
        val dialog = Dialog(requireContext())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val dialogBinding = DialogCommentBinding.inflate(LayoutInflater.from(context))
        dialog.setContentView(dialogBinding.root)
        binding.plantEntity?.let { plantEntity ->
            dialogBinding.editTextComment.setText(plantEntity.comment)
            dialogBinding.buttonSave.setOnClickListener {
                plantEntity.comment = dialogBinding.editTextComment.text.toString()
                detailsViewModel.insertPlantEntity(plantEntity)
                dialog.dismiss()
            }
        }
        dialog.window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            Constraints.LayoutParams.MATCH_PARENT
        )
        dialog.show()
    }

}