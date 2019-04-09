import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.min
import kotlin.text.*

// Complete the minimumDistances function below.
fun minimumDistances(a: Array<Int>): Int {

    var result = -1
    var array = a.toMutableList()

    for (i in a.indices) {
        array.removeAt(0)
        var distance = array.indexOf(a[i]) + 1
        when {
            distance > 0 && result == -1 -> result = distance
            distance > 0 && result > 0 -> result = min(result, distance)
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumDistances(a)
    println(result)
}