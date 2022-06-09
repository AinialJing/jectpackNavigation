package com.anniljing.jetpacknavigator.ui.dashboard

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anniljing.jetpacknavigator.R
import com.anniljing.jetpacknavigator.databinding.FragmentDashBoardDetailBinding
import java.lang.StringBuilder

class DashBoardFragmentDetail : Fragment() {
    private lateinit var binding: FragmentDashBoardDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDashBoardDetailBinding.inflate(inflater, container, false)
        val bundle = arguments
        var builder = StringBuilder()
        builder.append(bundle!!.getString("from")).append("-----").append(bundle.getInt("extra"))
        binding.dashBoardDetail.text = builder.toString()
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }
}