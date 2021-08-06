fun main() {

    print("pick food menu: ")
    when(readLine()!!.toInt()){
        1-> {
            print("You got Sandwich")
            print("You got Salad")
        }
        10->{
            println("You got burger")
        }
        else ->{
            println("You did not order")
        }
    }

}