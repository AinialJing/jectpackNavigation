package com.anniljing.jetpacknavigator.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.core.os.bundleOf
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.NavHostFragment
import com.anniljing.jetpacknavigator.R
import com.anniljing.jetpacknavigator.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val title = _binding!!.homeTitle
        title.setOnClickListener {
            val bundle: Bundle = bundleOf("from" to "HomeFragment", "extra" to 5)
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_navigation_home_to_secondActivity, bundle)
        }
        return _binding!!.root
    }
}