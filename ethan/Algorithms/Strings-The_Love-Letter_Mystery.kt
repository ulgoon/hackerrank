import java.util.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun theLoveLetterMystery(s: String): Int {
    var result = 0

    var i = 0
    while (i < s.length / 2) {
        result += abs(s[i] - s[s.length - 1 - i])
        i++
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = theLoveLetterMystery(s)

        println(result)
    }
}