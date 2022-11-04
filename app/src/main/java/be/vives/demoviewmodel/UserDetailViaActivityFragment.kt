package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import be.vives.demoviewmodel.databinding.FragmentUserDetailViaActivityBinding

class UserDetailViaActivityFragment : Fragment() {

    private val viewModelFactory: UserDetailFragmentViewModelFactory by lazy {
        UserDetailFragmentViewModelFactory((activity as UserActivity).getUser())
    }
    private val viewModel: UserDetailFragmentViewModel by viewModels {viewModelFactory}

    private lateinit var binding : FragmentUserDetailViaActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserDetailViaActivityBinding.inflate(layoutInflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        //val user = (activity as UserActivity).getUser()
        //val user = User("Dirk", "Hostens", false)

        /*binding.tvFirstName2.text = user.firstname
        binding.tvLastName2.text = user.lastName
        binding.swAvailable2.isChecked = user.available*/
        return binding.root
    }
}