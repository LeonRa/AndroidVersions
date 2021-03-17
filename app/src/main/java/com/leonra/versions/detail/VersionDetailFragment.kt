package com.leonra.versions.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.leonra.versions.databinding.FragmentVersionDetailBinding
import com.leonra.versions.model.Version
import com.leonra.versions.model.VersionRepository

/**
 * Detail view for a single Android [Version].
 */
class VersionDetailFragment : Fragment() {

    private val args: VersionDetailFragmentArgs by navArgs()
    private val version by lazy { VersionRepository.getForApiLevel(args.apiLevel) }

    private var _binding: FragmentVersionDetailBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVersionDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO Design me!
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
