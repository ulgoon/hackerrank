import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun nimbleGame(s: Array<Int>): String {

    return "First"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val s = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = nimbleGame(s)
        println(result)
    }
}