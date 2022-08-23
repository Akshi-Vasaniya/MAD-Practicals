package practical1

fun month(obj: Any): String =
    when(obj){
        1 -> "Jan"
        2 -> "Feb"
        3 -> "Mar"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "Aug"
        9 -> "Sep"
        10 -> "Oct"
        11 -> "Nov"
        12 -> "Dec"

        else -> "Enter Correct Number."
    }

fun main(){
    print("Enter number b/w 1-12 to display month: ")
    var a: Int = Integer.valueOf(readLine())
    println(month(a))
}