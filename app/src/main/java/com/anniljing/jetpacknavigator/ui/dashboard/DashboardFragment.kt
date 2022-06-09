package com.anniljing.jetpacknavigator.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.anniljing.jetpacknavigator.R
import com.anniljing.jetpacknavigator.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val textView: TextView = binding.textDashboard
        textView.text = "DashBoard"
        textView.setOnClickListener {
            val bundle = bundleOf("from" to "DashBoardHomeFragment", "extra" to 15)
            findNavController().navigate(
                R.id.action_navigation_dashboard_to_dashBoardFragmentDetail,
                bundle
            )
        }
        return _binding!!.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}