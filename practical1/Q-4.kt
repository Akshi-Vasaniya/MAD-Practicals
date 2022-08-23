package practical1

fun main(){
    print("Enter number: ")
    var a: Int = readLine()!!.toInt()
    println("${if (a % 2 == 0) "$a is even" else "$a is odd"}")

}