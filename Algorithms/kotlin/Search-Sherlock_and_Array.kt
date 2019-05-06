import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun balancedSums(arr: Array<Int>): String {

    return "NO"
}

fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val n = readLine()!!.trim().toInt()
        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = balancedSums(arr)
        println(result)
    }
}