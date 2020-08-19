package android.example.parkandrecreation.RecScreens.ProgramScreens

import android.example.parkandrecreation.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProgramAdapter(fragment: Fragment, recKey: String): FragmentStateAdapter(fragment){



    val programs = getProgram(recKey)

    override fun getItemCount(): Int = programs.size

    //create fragments of type ProgramDisplayFragment based on amount of items in "programs"
    override fun createFragment(position: Int): Fragment {
        val fragment = ProgramDisplayFragment()

        if(position < programs.size){
            val program = programs[position]
            fragment.arguments = Bundle().apply{
                putString("name", program.programName)
                putString("info", program.programInfo)
                putInt("image", program.ProgramImageOne)
            }
        }
        return fragment
    }

    /*
    This function puts information into the list to allow the adapter to display some
    information on the screen. Since the database was not working this was the best that could be
    done. However future versions of the application will remove this.
     */
    fun getProgram(recID: String): List<Program>{
        val programList: MutableList<Program> = mutableListOf()

        when(recID){
            "MW" ->{
                val exProgram: Program = Program(
            "Kick-Boxing",
            "This program involves punching things and kicking things to relieve " +
                    "stress, please don't hit the instructor.",
            "10 Dollars",
            R.drawable.kickboxing,
            R.drawable.afternoon_image,
            R.drawable.morning_image,
            R.drawable.rec_program_button)

                val exProgram2 = Program(
                "Karate",
                "This program involves hitting mr rodriguez in the face, if you miss " +
                        "he hits you back. ",
                "20 Dollars",
                R.drawable.karate_picture1,
                R.drawable.afternoon_image,
                R.drawable.morning_image,
                R.drawable.night_image)

                programList.add(exProgram)
                programList.add(exProgram2)
                return programList
            }

            "KP" ->{
                val exProgram: Program = Program(
                    "After School Time",
                    "Children can be picked up when school ends and brings them to " +
                            "the recreation center for snacks, homework help, and games! Please " +
                            "check with your recreation center to see if we pick up from your " +
                            "child's school, drop-off options are availble!",
                    "25",
                    R.drawable.afterschool,
                    R.drawable.painting,
                    R.drawable.painting,
                    R.drawable.painting)
                val exProgram2: Program = Program(
                    "Soccer",
                    "Participants ages 5-12 can participate in the annual seasonal " +
                            "City of Dallas Soccer league. Games will be played outdoors and a " +
                            "uniform and jersey will be included",
                    "40",
                    R.drawable.soccer,
                    R.drawable.painting,
                    R.drawable.painting,
                    R.drawable.painting)

                programList.add(exProgram)
                programList.add(exProgram2)
                return programList
            }

            else ->{
                val invalidProgram: Program =Program(
                    "Empty Program",
                    "Empty Program",
                    "0",
                    R.drawable.morning_image,
                    R.drawable.painting,
                    R.drawable.painting,
                    R.drawable.painting
                )

                programList.add(invalidProgram)
                return programList
            }


        }

    }
}