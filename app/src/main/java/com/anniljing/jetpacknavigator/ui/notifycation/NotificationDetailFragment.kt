package com.anniljing.jetpacknavigator.ui.notifycation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.anniljing.jetpacknavigator.R
import com.anniljing.jetpacknavigator.databinding.FragmentNotificationDetailBinding

class NotificationDetailFragment : Fragment() {
    //使用navArgs代理获取参数
    val args: NotificationDetailFragmentArgs by navArgs()
    private lateinit var binding: FragmentNotificationDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationDetailBinding.inflate(inflater, container, false)
        binding.notificationDetailTv.text = args.content
        return binding.root
    }

}