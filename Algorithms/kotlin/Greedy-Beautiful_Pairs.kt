import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun beautifulPairs(A: Array<Int>, B: Array<Int>): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = beautifulPairs(A, B)
    println(result)
}