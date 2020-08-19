package android.example.parkandrecreation.RecScreens

/**
 * Data class used to hold one instance of a recreation center from the database
 */

data class RecreationCenter(
    val centerName: String,
    val centerNumber: String,
    val centerOpening: String,
    val centerClosing: String,
    val centerImageOne: Int,
    val centerImageTwo: Int,
    val centerImageThree: Int,
    val centerImageFour: Int
)