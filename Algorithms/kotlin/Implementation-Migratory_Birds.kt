import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the migratoryBirds function below.
fun migratoryBirds(ar: Array<Int>): Int {
    return ar.groupBy { it }.entries.sortedBy { it.key }.sortedByDescending { it.value.size }.first().key
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = migratoryBirds(ar)
    println(result)
}