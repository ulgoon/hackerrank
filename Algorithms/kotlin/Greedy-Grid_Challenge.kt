import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gridChallenge(grid: Array<String>): String {

    return "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val grid = Array<String>(n, { "" })
        for (i in 0 until n) {
            val gridItem = scan.nextLine()
            grid[i] = gridItem
        }

        val result = gridChallenge(grid)
        println(result)
    }
}