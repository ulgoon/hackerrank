import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the beautifulTriplets function below.
fun beautifulTriplets(d: Int, arr: Array<Int>): Int {
    var result = 0

    arr.forEach { if (arr.contains(it + d) && arr.contains(it + d + d)) result++ }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")
    val n = nd[0].trim().toInt()
    val d = nd[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = beautifulTriplets(d, arr)
    println(result)
}