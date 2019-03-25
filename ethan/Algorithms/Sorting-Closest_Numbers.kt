import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun closestNumbers(arr: Array<Int>): Array<Int> {

    return arrayOf(0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = closestNumbers(arr)
    println(result.joinToString(" "))
}