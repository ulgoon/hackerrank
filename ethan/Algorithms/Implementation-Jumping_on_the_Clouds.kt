import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var result = 0
    var lo = 0

    while (lo < c.size - 1) {
        lo += if (c.getOrNull(lo + 2) == 0) 2
        else 1
        result++
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)
    println(result)
}