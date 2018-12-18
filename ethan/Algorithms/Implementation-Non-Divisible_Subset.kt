import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the nonDivisibleSubset function below.
fun nonDivisibleSubset(k: Int, S: Array<Int>): Int {

    return 0
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