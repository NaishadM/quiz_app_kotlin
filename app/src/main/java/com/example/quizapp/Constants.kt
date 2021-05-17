import com.example.quizapp.Question
import com.example.quizapp.R
import java.lang.StringBuilder


object Constants {


    const val USER: String="user_name"
    const val Total:String="total_questions"
    const val Correct:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()
        val que1 = Question(
                1,
                "Can you identify this famous landmarks?",
                R.drawable.ic_colosseum,
                "statue of liberty",
                "Machu picchu",
                "colosseum",
                "washington Monument",
                3)
        questionsList.add(que1)

        val que2 = Question(
                2,
                "Can you identify this famous landmarks?",
                R.drawable.ic_machupichu,
                "statue of liberty",
                "Machu picchu",
                "colosseum",
                "washington Monument",
                2)
        questionsList.add(que2)

        val que3 = Question(
                3,
                "Can you identify this famous landmarks?",
                R.drawable.ic_matterhorn,
                "statue of liberty",
                "washington Monument",
                "colosseum",
                "matterhorn",
                4)
        questionsList.add(que3)

        val que4 = Question(
                4,
                "Can you identify this famous landmarks?",
                R.drawable.ic_mountfuji,
                "statue of liberty",
                "Machu picchu",
                "Mount Fuji",
                "colosseum",
                3)
        questionsList.add(que4)

        val que5 = Question(
                5,
                "Can you identify this famous landmarks?",
                R.drawable.ic_washington_monument,
                "statue of liberty",
                "Machu picchu",
                "colosseum",
                "washington Monument",
                4)
        questionsList.add(que5)

        val que6 = Question(
                18,
                "Can you identify this famous landmarks?",
                R.drawable.ic_golden_gate_bridge,
                "colosseum",
                "Brandenburg Gate",
                "Golden Gate Bridge",
                "Leaning Tower",
                3)
        questionsList.add(que6
        )
        val que7 = Question(
                7,
                "Can you identify this famous landmarks?",
                R.drawable.ic_liberty,
                "statue of liberty",
                "Leaning tower",
                "colosseum",
                "Machu picchu",
                1)
        questionsList.add(que7)

        val que8 = Question(
                8,
                "Can you identify this famous landmarks?",
                R.drawable.ic_leaningtower,
                "statue of liberty",
                "Machu picchu",
                "Leaning Tower",
                "washington Monument",
                3)
        questionsList.add(que8)

        val que9 = Question(
                9,
                "Can you identify this famous landmarks?",
                R.drawable.ic_sydneyoperahouse,
                "Machi picchu",
                "Sydney opera house",
                "colosseum",
                "stonehenge",
                2)
        questionsList.add(que9)

        val que10 =Question(
                10,
                "Can you identify this famous landmarks?",
                R.drawable.ic_sugarloaf,
                "statue of liberty",
                "Leaning Tower",
                "Golden Gate Bridge",
                "SugarLoaf",
                4)
        questionsList.add(que10)

        val que11 = Question(
                11,
                "Can you identify this famous landmarks?",
                R.drawable.ic_stonehenge,
                "stonehenge",
                "pyramids",
                "Mout fuji",
                "washington Monument",
                1)
        questionsList.add(que11)

        val que12 = Question(
                12,
                "Can you identify this famous landmarks?",
                R.drawable.ic_empire_state_building,
                "statue of liberty",
                "Machu picchu",
                "colosseum",
                "Empire state Building",
                4)
        questionsList.add(que12)

        val que13 = Question(
                13,
                "Can you identify this famous landmarks?",
                R.drawable.ic_pyramids,
                "Machu picchu",
                "washington Monument",
                "colosseum",
                "Pyramids",
                4)
        questionsList.add(que13)

        val que14 = Question(
                14,
                "Can you identify this famous landmarks?",
                R.drawable.ic_greatwall,
                "Golden Gate Bridge",
                "Great wall of Chine",
                "colosseum",
                "Taj mahal",
                2)
        questionsList.add(que14)

        val que15 = Question(
                15,
                "Can you identify this famous landmarks?",
                R.drawable.ic_tajmahal,
                "statue of liberty",
                "Taj Mahal",
                "colosseum",
                "washington Monument",
                2)
        questionsList.add(que15)

        val que16 = Question(
                16,
                "Can you identify this famous landmarks?",
                R.drawable.ic_effieltower,
                "statue of liberty",
                "Effiel Tower",
                "colosseum",
                "washington Monument",
                2)
        questionsList.add(que16)

        val que17 = Question(
                17,
                "Can you identify this famous landmarks?",
                R.drawable.ic_brandenburg_gate,
                "washington Monument",
                "Brandenburg Gate",
                "colosseum",

                "Machu picchu",
                2)
        questionsList.add(que17)

        val que18 = Question(
                18,
                "Can you identify this famous landmarks?",
                R.drawable.ic_golden_gate_bridge,
                "colosseum",
                "Brandenburg Gate",
                "Golden Gate Bridge",
                "Leaning Tower",
                3)
        questionsList.add(que18)




        return questionsList
    }

}