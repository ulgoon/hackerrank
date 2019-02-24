import java.util.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun funnyString(s: String): String {
    val rs = s.reversed()

    var i = 0
    while (i < s.length - 1) {
        if (abs(s[i] - s[i+1]) != abs(rs[i] - rs[i+1])) {
            return "Not Funny"
        }
        i++
    }
    return "Funny"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = funnyString(s)

        println(result)
    }
}