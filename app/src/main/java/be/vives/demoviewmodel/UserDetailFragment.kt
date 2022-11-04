package be.vives.demoviewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import be.vives.demoviewmodel.databinding.FragmentUserDetailBinding

class UserDetailFragment : Fragment() {
    private val args: UserDetailFragmentArgs by navArgs<UserDetailFragmentArgs>()
    private val viewModelFactory: UserDetailFragmentViewModelFactory by lazy {
        UserDetailFragmentViewModelFactory(args.user)
    }
    private val viewModel: UserDetailFragmentViewModel by viewModels {viewModelFactory}

    private lateinit var binding: FragmentUserDetailBinding

    //private var teller = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentUserDetailBinding.inflate(layoutInflater,  container, false)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        //val user = User("Dirk", "Hostens", false)

        //val user = UserDetailFragmentArgs.fromBundle(requireArguments()).user

        /*binding.tvFirstName.text = user.firstname
        binding.tvLastName.text = user.lastName
        binding.swAvailable.isChecked = user.available
        binding.swAvailable.setOnClickListener {
            ++teller
            binding.tvFirstName.text = "aantal: " + teller
        }*/
        return binding.root
    }


}