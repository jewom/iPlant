package com.iplant.ui.settings

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.database.Prefs
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.databinding.FragmentSearchBinding
import com.iplant.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var settingsViewModel: SettingsViewModel
    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        settingsViewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)

        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_settings, container, false
        )

        binding.switchNightMode.isChecked = Prefs.nightMode == AppCompatDelegate.MODE_NIGHT_YES || context?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

        binding.switchNightMode.setOnCheckedChangeListener { _, isChecked ->
            Prefs.nightMode = if (isChecked) AppCompatDelegate.MODE_NIGHT_YES else AppCompatDelegate.MODE_NIGHT_NO
        }

        binding.buttonClearData.setOnClickListener {
            showClearDataDialog()
        }

        return binding.root
    }


    private fun showClearDataDialog() {

        // instantiate builder variable
        val builder = AlertDialog.Builder(requireContext())
        // set title
        builder.setTitle(getString(R.string.are_you_sure))
        //set content area
        builder.setMessage(getString(R.string.do_you_want_clear))

        //set positive button
        builder.setPositiveButton(android.R.string.ok) { dialog, id ->
            // User click on the positive button
        }

        //set negative button
        builder.setNegativeButton(android.R.string.cancel) { dialog, id ->
            // User cancelled the dialog
        }

        builder.show()

    }

}