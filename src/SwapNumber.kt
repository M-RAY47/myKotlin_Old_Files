

fun main() {
    print("Enter number1:")
    var number1:Int = readLine()!!.toInt()

    print("Enter number2:")
    var number2:Int = readLine()!!.toInt()

    val temp:Int=number1
    number1=number2
    number2 = temp
    println("Swap numbers is-->Number1: $number1, Number2: $number2")

}