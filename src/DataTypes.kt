fun main(){

    val name ="M.RAY"
    val age = 24
    val gpa = 3.15
    println("===== User info =====")
    println("name:$name")
    println("Age:$age")
    println("GPA: $gpa")

    var count=1
    for (number in 1..5){
        count += 1
        println("count: $count")
    }
    count=10
    println("count: $count")


    var department:String?
    department = null
    department="Softwaire"
    println("departement ${department}!!")

}