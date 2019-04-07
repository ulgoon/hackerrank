import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the flatlandSpaceStations function below.
fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    var result = c[0]

    for (i in 1 until c.size) {
        var distance = (c[i] - c[i - 1]) / 2
        if (distance > result) result = distance
    }

    var restDistance = n - 1 - c.last()
    if (restDistance > result) result = restDistance

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")
    val n = nm[0].trim().toInt()
    val m = nm[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray().sortedArray()

    val result = flatlandSpaceStations(n, c)
    println(result)
}