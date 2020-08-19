package android.example.parkandrecreation.RecScreens.ProgramScreens

/**
 * Data class Program, each class will be one instance of "program" from the database.
 */

data class Program(
    val programName: String,
    val programInfo: String,
    val programPrice: String,
    val ProgramImageOne: Int,
    val ProgramImageTwo: Int,
    val ProgramImageThree: Int,
    val ProgramImageFour: Int
)