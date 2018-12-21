import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the nonDivisibleSubset function below.
fun nonDivisibleSubset(k: Int, S: Array<Int>): Int {

    var counts = Array(size = k) { 0 }

    for (i in S) {
        counts[i%k]++
    }

    var result = minOf(counts[0], 1)

    for (i in 1..k/2) {
        if (i != k-i) {
            result += maxOf(counts[i], counts[k - i])
        } else if (counts[i] > 0) {
            result++
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val S = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = nonDivisibleSubset(k, S)

    println(result)
}