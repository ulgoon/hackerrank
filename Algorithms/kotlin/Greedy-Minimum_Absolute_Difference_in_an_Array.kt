import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun minimumAbsoluteDifference(arr: Array<Int>): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)
    println(result)
}