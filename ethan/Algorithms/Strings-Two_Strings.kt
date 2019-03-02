import java.util.*
import kotlin.io.*
import kotlin.text.*

fun twoStrings(s1: String, s2: String): String {

    for (i in s1.toSet()) {
        if (i in s2.toSet()) return "YES"
    }
    return "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s1 = scan.nextLine()
        val s2 = scan.nextLine()

        val result = twoStrings(s1, s2)
        println(result)
    }
}