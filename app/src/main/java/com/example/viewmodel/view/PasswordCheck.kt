package com.example.viewmodel.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.PasswordBinding
import com.example.viewmodel.viewmodel.PasswordViewModel
import androidx.core.widget.addTextChangedListener

class PasswordCheck : Fragment() {

    private var _binding: PasswordBinding? = null
    private val binding: PasswordBinding get() = _binding!!

    private lateinit var viewModel: PasswordViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = PasswordBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(PasswordViewModel::class.java)
        with(binding) {



        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



