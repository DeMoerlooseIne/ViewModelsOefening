package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import be.vives.demoviewmodel.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater,  container, false)
        viewModel = MainFragmentViewModel()
        val user = User("Dirk", "Hostens", false)

        viewModel.navigateToUserFragment.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserDetailFragment(user))
                viewModel.navigateFinished()
            }
        })

        viewModel.navigateToUserActivity.observe(viewLifecycleOwner, Observer {
            if (it) {
                findNavController().navigate((MainFragmentDirections.actionMainFragmentToUserActivity(user)))
                viewModel.navigateFinished()
            }
        })

        /*binding.btnNavigateToUserDetail.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserDetailFragment(user))
        }*/
        /*binding.btnNavigateUserDetailActivity.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToUserActivity(user))
        }*/
        return binding.root
    }


}