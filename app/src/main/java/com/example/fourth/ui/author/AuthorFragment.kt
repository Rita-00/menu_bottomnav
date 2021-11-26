package com.example.fourth.ui.author

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.fourth.databinding.FragmentAlbumsBinding
import com.example.fourth.ui.author.AuthorViewModel

class AuthorFragment  : Fragment() {
    private lateinit var authorViewModel: AuthorViewModel
    private var _binding: FragmentAlbumsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        authorViewModel =
            ViewModelProvider(this).get(AuthorViewModel::class.java)

        _binding = FragmentAlbumsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        authorViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}