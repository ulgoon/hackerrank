import java.util.*
import kotlin.io.*
import kotlin.text.*

fun flippingBits(n: Long): Long {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toLong()

        val result = flippingBits(n)
        println(result)
    }
}