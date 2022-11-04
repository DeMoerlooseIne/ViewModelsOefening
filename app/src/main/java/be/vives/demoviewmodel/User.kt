package be.vives.demoviewmodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var firstname: String, var lastName: String, var available: Boolean ) : Parcelable {

}