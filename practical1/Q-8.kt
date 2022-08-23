package practical1

fun main(){
    println("Create Array-1 by using arrayOf() method: ")
    var arr1 = arrayOf(1, 2, 3)
    println(arr1.joinToString())

    println("Create Array-2 by using Array<>(): ")
    var arr2 = arrayOf<Int>(1, 2, 3)
    println(arr2.contentDeepToString())

    println("Create Array-3 by using Array<>() and lambda fun: ")
    val arr3 = Array(8) { i -> i * 1 }
    println(arr3.contentToString())

    println("Create Array-4 by using IntArray(): ")
    val arr4 = IntArray(5){0}
    println(arr4.joinToString())

    println("Create Array-5 by using intArrayOf(): ")
    val arr5 = intArrayOf(12,10,1,5,18,19)
    println(arr5.joinToString())

    println("Create 2D Array-6 by using arrayOf() and intArrayOf(): ")
    val arr6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println(arr6.contentDeepToString())

    val arr7 = IntArray(5)
    println("Please Enter Array Value: ")
    for (i in arr7.indices){
        print("a[$i]=")
        arr7[i] = readLine()!!.toInt()
    }
    println("***********With Built-in Function***********")
    println("After sorting by built-in function:")
    println(arr7.joinToString())
    val arr8 = arrayOf(4, 5, 1, 2, 3)
    println("***********Without Built-in Function***********")
    println("Before Sorting:")
    println(arr8.joinToString())
    for (i in arr8.indices){
        for (j in arr8.indices){
            if(arr8[i]<arr8[j]){
                val temp = arr8[i]
                arr8[i] = arr8[j]
                arr8[j] = temp
            }
        }
    }
    println("After Sorting without built-in function:")
    println(arr8.joinToString())
}