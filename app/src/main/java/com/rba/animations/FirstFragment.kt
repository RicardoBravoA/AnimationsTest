package com.rba.animations

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rba.animations.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstBinding.inflate(inflater)

        binding.rotateButton.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(binding.starImageview, View.ROTATION, -360f, 0f)
            animator.duration = 1000
            animator.disableViewDuringAnimation(it)
            animator.start()
        }

        binding.translateButton.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(binding.starImageview, View.TRANSLATION_X, 200f)
            animator.repeatCount = 1
            animator.repeatMode = ObjectAnimator.REVERSE
            animator.disableViewDuringAnimation(it)
            animator.start()
        }

        return binding.root
    }
}