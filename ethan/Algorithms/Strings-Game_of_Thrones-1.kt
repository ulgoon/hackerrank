import java.util.*
import kotlin.io.*

fun gameOfThrones(s: String): String {

    var oneOdd = false
    for (i in s.groupingBy { it }.eachCount().values) {
        if (i % 2 != 0) {
            when {
                s.length % 2 == 0 -> return "NO"
                oneOdd -> return "NO"
                else -> oneOdd = true
            }
        }
    }ㅑ

    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = gameOfThrones(s)

    println(result)
}