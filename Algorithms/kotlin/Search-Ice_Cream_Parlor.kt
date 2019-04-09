import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {

    return arrayOf(0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val m = scan.nextLine().trim().toInt()
        val n = scan.nextLine().trim().toInt()
        val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)
        println(result.joinToString(" "))
    }
}