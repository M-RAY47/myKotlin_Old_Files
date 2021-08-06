import java.util.*

fun main() {

    print("Enter Year of Birth:")
    val yearOfBirth:Int = readLine()!!.toInt()
    val yearInDevice: Int = Calendar.getInstance().get(Calendar.YEAR)
    val age: Int =yearInDevice - yearOfBirth
    print("You are $age year old")

}