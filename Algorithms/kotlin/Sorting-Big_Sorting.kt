import java.util.*
import kotlin.Comparator
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun bigSorting(unsorted: Array<String>): Array<String> {

    return unsorted.sortedWith(Comparator { n1, n2 ->
        when {
            n1.length > n2.length -> 1
            n1.length < n2.length -> -1
            else -> {
                when {
                    n1 > n2 -> 1
                    n1 < n2 -> -1
                    else -> 0
                }
            }
        }
    }).toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val unsorted = Array(n) { "" }
    for (i in 0 until n) {
        val unsortedItem = scan.nextLine()
        unsorted[i] = unsortedItem
    }

    val result = bigSorting(unsorted)

    println(result.joinToString("\n"))
}