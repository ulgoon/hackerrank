import java.util.*
import kotlin.collections.*
import kotlin.io.*

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
µ
    return ""
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nk = scan.nextLine().split(" ")
        val n = nk[0].trim().toInt()
        val k = nk[1].trim().toInt()

        val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = twoArrays(k, A, B)
        println(result)
    }
}