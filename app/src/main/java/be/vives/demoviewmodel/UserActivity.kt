package be.vives.demoviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import be.vives.demoviewmodel.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        user = UserActivityArgs.fromBundle(intent.extras!!).user
        binding = ActivityUserBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
    fun getUser() : User {
        return user
    }

}