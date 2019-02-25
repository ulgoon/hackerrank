import java.util.*
import kotlin.io.*
import kotlin.text.*

fun alternatingCharacters(s: String): Int {
    var result = 0

    var i = 0
    while (i < s.length-1) {
        if (s[i] == s[i+1]) {
            result++
        }
        i++
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}