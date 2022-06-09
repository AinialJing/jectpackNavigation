package com.anniljing.jetpacknavigator.ui.notifycation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import com.anniljing.jetpacknavigator.R
import com.anniljing.jetpacknavigator.databinding.FragmentNotifycationBinding

class NotificationFragment : Fragment() {
    private var binding: FragmentNotifycationBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotifycationBinding.inflate(inflater, container, false)
        binding!!.notificationTv.setOnClickListener {
            /**
             * NotificationFragmentDirections 系统自动生成
             * toDetailFragment的入参就是xml里面目标对象定义的参数
             */
            val toDetailFragment = NotificationFragmentDirections.toDetailFragment("福田区今天大到暴雨")
            NavHostFragment.findNavController(this).navigate(toDetailFragment)
        }
        return binding!!.root
    }
}