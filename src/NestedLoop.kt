fun main() {
    print("Enter number of Users: ")
    val UserCount = readLine()!!.toInt()
    for (UserID in 1..UserCount){
        println("$UserID- Enter your name:")
        val name = readLine()!!.toString()
        println("Where you live: ")
        val livePlace = readLine()!!.toString()
        var petName =""
        print("Enter number of Pets: ")
        val petsCount = readLine()!!.toInt()
        for (petID in 1..petsCount){

            println("Enter Pet $petID: ")
            petName = petName+ readLine()!!.toString() + ","
        }
        println("===== User info=====")
        println("name: $name")
        println("liveplace: $livePlace")
        println("petName: $petName")
    }
}