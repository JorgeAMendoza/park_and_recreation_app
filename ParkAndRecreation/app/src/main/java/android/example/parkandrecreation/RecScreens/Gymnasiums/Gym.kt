package android.example.parkandrecreation.RecScreens.Gymnasiums

/**
 * Data class for one instance of a Gym from the database.
 */

data class Gym(
    val gymName: String,
    val gymInfo: String,
    val gymImageOne: Int,
    val gymImageTwo: Int,
    val gymImageThree:Int
)