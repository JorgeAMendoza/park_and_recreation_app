package android.example.parkandrecreation.RecScreens.FitnessRoom

/**
 * Data class for one instance of a fitness room from the database
 */
data class FitnessRoom(
    val fitnessName: String,
    val fitnessInfo: String,
    val fitnessPrice: String,
    val fitnessImageOne: Int,
    val fitnessImageTwo: Int,
    val fitnessImageThree: Int
)