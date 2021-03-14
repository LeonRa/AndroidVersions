package com.leonra.versions.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.leonra.versions.databinding.FragmentVersionListBinding
import com.leonra.versions.model.Version
import com.leonra.versions.model.VersionRepository

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

        val versionAdapter = VersionListAdapter()

        binding.recyclerView.run {
            adapter = versionAdapter
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
        }

        versionAdapter.submitList(VersionRepository.getAll())
    }

    // TODO: Hook up this callback
    private fun onVersionClicked(version: Version) = findNavController().navigate(
        VersionListFragmentDirections.actionVersionListToSecondFragment(
            label = version.codename,
            apiLevel = version.apiLevel,
        )
    )
}
