package be.vives.demoviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class UserDetailFragmentViewModelFactory(private val user: User) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserDetailFragmentViewModel::class.java)) {
            return UserDetailFragmentViewModel(user) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}