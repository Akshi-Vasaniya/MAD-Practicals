package practical1

import java.math.BigInteger

fun factorial(n: Int): Int{
    return if(n == 1) n else n * factorial(n-1)
}

tailrec fun factorialWithTailrec(n: BigInteger, temp: BigInteger = BigInteger("1")): BigInteger{
    return if(n == BigInteger("1")){temp}  else{ factorialWithTailrec(n-BigInteger("1"), temp*n)}
}

fun main(){
    print("Enter any number: ")
    var num: Int = Integer.valueOf(readLine())
    println("Factorial of $num  = "+ factorial(num))
    println("Factorial of $num with tailrec keyword = "+ factorialWithTailrec(BigInteger("$num")))  
}