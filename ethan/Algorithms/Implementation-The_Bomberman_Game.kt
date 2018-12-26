import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun bomberMan(n: Int, grid: Array<String>): Array<String> {

    return arrayOf("")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val rcn = scan.nextLine().split(" ")
    val r = rcn[0].trim().toInt()
    val c = rcn[1].trim().toInt()
    val n = rcn[2].trim().toInt()

    val grid = Array(r) { "" }
    for (i in 0 until r) {
        val gridItem = scan.nextLine()
        grid[i] = gridItem
    }

    val result = bomberMan(n, grid)
    println(result.joinToString("\n"))
}