fun main() {
    println("Comtinue Example")
    for (number in 1..10){
        if (number==5){
            continue
        }
        println(number)
    }
    println("Break Example")
    for (number in 1..10){
        if (number==8){
            break
        }
        println(number)
    }
    val x = ' '
    if (x==','){
        println("I love you")
    }
    else{
        println("I hate you")
    }
    println("Break Inner Example")
    loop@ for (number in 1..10){
        println(number)
        for (innerLoop in 1..7){
            println("innerLoop: $innerLoop")
            if(innerLoop==6){
                return
            }
        }
    }
}
