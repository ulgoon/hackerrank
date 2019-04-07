import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the serviceLane function below.
fun serviceLane(width: List<Int>, cases: MutableList<List<Int>>): Array<Int> {

    var result = Array(cases.size) {0}
    for (i in cases.indices) {
        result[i] = width.slice(cases[i].first()..cases[i].last()).min()!!
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nt = scan.nextLine().split(" ")
    val n = nt[0].trim().toInt()
    val t = nt[1].trim().toInt()

    val width = scan.nextLine().split(" ").map{ it.trim().toInt() }

    val cases = mutableListOf<List<Int>>()
    for (i in 0 until t) {
        cases.add(scan.nextLine().split(" ").map{ it.trim().toInt() })
    }

    val result = serviceLane(width, cases)
    println(result.joinToString("\n"))
}