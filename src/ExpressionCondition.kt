fun main() {

    val isMarried =true
    val GPA = 3.8

    val isQualified = if (isMarried==true && GPA>=3.8) 1 else 0
    print(isQualified)
    val isGood = when(GPA){
        4.0 -> true
        else -> false
    }
}