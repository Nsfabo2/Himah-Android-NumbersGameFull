import kotlin.random.Random

fun main(){
    val secret_number = Random.nextInt(11)
    print("Guess a number between 0 and 10: ")

    try{
        var count = 0
        while (count<3){
            val user_Guess = readLine()!!
            when {
                user_Guess == "quit" -> { println("bye"); break}
                user_Guess.toInt()>10 -> println("please guess a number between 0 and 10")
                user_Guess.toInt() == secret_number -> println("You got it! we have a winner")
                else ->  println("Wrong guess!")
            }

            //println("Game over")
            count++
        }

    }catch (e: Exception){
        print("something isn't correct please enter a number")
    }

}