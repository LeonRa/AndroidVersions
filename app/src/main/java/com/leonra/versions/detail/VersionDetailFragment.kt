package com.leonra.versions.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.leonra.versions.databinding.FragmentVersionListBinding
import com.leonra.versions.model.Version

/**
 * Detail view for a single Android [Version].
 */
class VersionDetailFragment : Fragment() {

    private val args: VersionDetailFragmentArgs by navArgs()

    private var _binding: FragmentVersionListBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVersionListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO Design me!
    }
}
