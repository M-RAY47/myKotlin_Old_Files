fun main() {

    println("Pets App")
    println("enter your pets name:")
    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("Your pets Are")
    println("pet1: $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    //Write App in Array
    println("Enter your pets name again")
    val listOfPets:Array<String> = Array(3){""}
    for (i in 0..2) {
        listOfPets[i] = readLine()!!.toString()
        if (i == 2){
            println("Your pets name are: ")
            for (j in listOfPets) println("pet${listOfPets.indexOf(j)+1}: $j")
        }
    }
    /*for (i in 0..2) {
        var pet = 0
        pet += 1
        println("Enter your pet$pet name:")
        //var pet5 = readLine()!!.toString()
    }
*/
}