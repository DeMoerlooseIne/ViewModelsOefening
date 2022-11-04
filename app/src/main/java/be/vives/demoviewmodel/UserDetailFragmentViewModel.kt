package be.vives.demoviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserDetailFragmentViewModel(val __user: User) : ViewModel() {

    private var _user = MutableLiveData<User>()
    private var _teller = MutableLiveData<Int>()
    val user : LiveData<User>
    get() {
        return _user
    }

    init {
        _user.value = __user
        _teller.value = 0
    }

    fun switchClicked() {
        _teller.value = _teller.value!! + 1
        val newUser = _user.value!!
        newUser.firstname = "clicked " +  _teller.value!! + " " + user.value!!.available
        _user.value = newUser
    }
}