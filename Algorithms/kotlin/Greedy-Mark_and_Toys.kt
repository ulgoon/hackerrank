import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun maximumToys(prices: Array<Int>, k: Int): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val prices = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = maximumToys(prices, k)
    println(result)
}