import java.util.*
import kotlin.text.*

fun separateNumbers(s: String): Unit {

    println("NO")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()
        separateNumbers(s)
    }
}