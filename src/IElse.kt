fun main() {

    println("Enter your age: ")
    val age = readLine()!!.toInt()
    if (age>=18){
        println("You could apply for the job")
    }
    else{
        println("You could not apply for the job")
    }
    println("END APP")
}