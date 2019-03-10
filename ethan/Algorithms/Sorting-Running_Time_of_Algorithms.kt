import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun runningTime(arr: Array<Int>): Int {

    var result = 0
    (1 until arr.size).forEach loop@{
        (it downTo 1).forEach { index ->
            if(arr[index] < arr[index-1]) {
                arr[index] = arr[index-1].also { arr[index-1] = arr[index] }
                result++
            } else {
                return@loop
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = runningTime(arr)
    println(result)
}