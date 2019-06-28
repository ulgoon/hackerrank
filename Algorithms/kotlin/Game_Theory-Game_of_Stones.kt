import java.util.*
import kotlin.io.*
import kotlin.text.*

fun gameOfStones(n: Int): String {

    return "First"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = gameOfStones(n)

        println(result)
    }
}