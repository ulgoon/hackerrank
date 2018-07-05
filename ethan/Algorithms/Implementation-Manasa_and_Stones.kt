import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.max
import kotlin.math.min
import kotlin.text.*

// Complete the stones function below.
fun stones(n: Int, a: Int, b: Int): Array<Int> {

    var result = mutableSetOf<Int>()
    val big = max(a, b)
    val small = min(a, b)

    var difference = big - small
    var min = small * (n - 1)
    var max = big * (n - 1)

    if (difference == 0) {
        result.add(max)
    } else {
        while (min <= max) {
            result.add(min)
            min += difference
        }
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val T = scan.nextLine().trim().toInt()

    for (TItr in 1..T) {
        val n = scan.nextLine().trim().toInt()
        val a = scan.nextLine().trim().toInt()
        val b = scan.nextLine().trim().toInt()

        val result = stones(n, a, b)
        println(result.joinToString(" "))
    }
}