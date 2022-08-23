package practical1

fun add(a: Int, b: Int): Int{
    return a + b
}
fun sub(a: Int, b: Int): Int{
    return a - b
}
fun multi(a: Int, b: Int): Int{
    return a * b
}
fun div(a: Int, b: Int): Float {
    return a / b.toFloat()
}

fun main(){
    println("Addition = "+ add(5, 5))
    println("Subtraction = "+ sub(10 , 5))
    println("Multiplication = "+ multi(5, 2))
    println("Division = "+ div(8, 2))

}