import java.util.*
import kotlin.io.*
import kotlin.text.*

fun hackerrankInString(s: String): String {

    return ""
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = hackerrankInString(s)

        println(result)
    }
}