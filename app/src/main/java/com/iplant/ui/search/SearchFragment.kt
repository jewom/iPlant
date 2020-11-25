package com.iplant.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.databinding.FragmentSearchBinding
import com.iplant.ui.adapters.PlantsListAdapter

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel
    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_search, container, false
        )

        val adapter = PlantsListAdapter()
        binding.recyclerViewPlants.adapter = adapter

        searchViewModel.searchRequestSuccess.observe(viewLifecycleOwner, { searchResult ->
            adapter.submitList(searchResult.data)
        })

        searchViewModel.searchRequestError.observe(viewLifecycleOwner, {

        })

        binding.searchViewPlant.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText != null)
                    searchViewModel.searchRequest(newText)
                return false
            }

        })

        return binding.root
    }

}