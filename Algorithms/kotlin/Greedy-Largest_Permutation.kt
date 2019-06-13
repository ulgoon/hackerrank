import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun largestPermutation(k: Int, arr: Array<Int>): Array<Int> {

    return arrayOf(0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = largestPermutation(k, arr)
    println(result.joinToString(" "))
}