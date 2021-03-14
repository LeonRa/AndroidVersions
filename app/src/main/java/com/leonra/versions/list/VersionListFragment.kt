package com.leonra.versions.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.leonra.versions.R
import com.leonra.versions.databinding.FragmentVersionListBinding
import com.leonra.versions.model.Version

/**
 * A list of all of our Android [Version]s.
 */
class VersionListFragment : Fragment() {

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

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_VersionList_to_SecondFragment)
        }
    }
}
