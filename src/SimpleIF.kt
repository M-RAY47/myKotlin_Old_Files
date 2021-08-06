fun main() {

    print("Enter your grade: ")
    val grade: Int= readLine()!!.toInt()

    if (grade >= 90){
        println("A")
    }else if (grade in 80..89){
        println("B")
    }else if (grade in 70..79){
        println("C")
    }else if (grade<70){
        println("Fail")

    }

}