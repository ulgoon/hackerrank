import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun bigSorting(unsorted: Array<String>): Array<String> {

    return arrayOf("")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val unsorted = Array<String>(n) { "" }
    for (i in 0 until n) {
        val unsortedItem = scan.nextLine()
        unsorted[i] = unsortedItem
    }

    val result = bigSorting(unsorted)

    println(result.joinToString("\n"))
}