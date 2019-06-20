import java.util.*
import kotlin.io.*
import kotlin.text.*

fun flippingBits(n: Long): Long {

    // 1. 2의 32승 값에 -1을 하여 32bit 모두 1을 갖는 수와 xor 연산을 한다.
    return n.xor((Math.pow(2.0, 32.0) - 1).toLong())
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