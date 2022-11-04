package be.vives.demoviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragmentViewModel(): ViewModel() {

    private var _navigateToUserFragment = MutableLiveData<Boolean>()
    val navigateToUserFragment : LiveData<Boolean>
        get() {
            return _navigateToUserFragment
        }

    private var _navigateToUserActivity = MutableLiveData<Boolean>()
    val navigateToUserActivity : LiveData<Boolean>
        get() {
            return _navigateToUserActivity
        }
    init {
        _navigateToUserFragment.value = false
        _navigateToUserActivity.value = false
    }

    fun btnNavigateToUserFragment() {
        _navigateToUserFragment.value = true
    }

    fun btnNavigateToUserActivity() {
        _navigateToUserFragment.value = false
    }

    fun navigateFinished()
    {
        _navigateToUserFragment.value = false
        _navigateToUserActivity.value = false
    }
}