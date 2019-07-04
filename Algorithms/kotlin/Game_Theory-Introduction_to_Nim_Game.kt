import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun nimGame(pile: Array<Int>): String {

    return "First"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val n = scan.nextLine().trim().toInt()

        val pile = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = nimGame(pile)
        println(result)
    }
}