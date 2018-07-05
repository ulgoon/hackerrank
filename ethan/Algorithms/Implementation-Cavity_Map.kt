import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the cavityMap function below.
fun cavityMap(grid: Array<String>): Array<String> {

    var result = grid
    for (i in grid.indices) {
        if (i == 0) continue
        else if (i == grid.size -1 ) break

        for (j in grid.indices) {
            if (j == 0 || j == grid.size - 1) continue

            val current = grid[i][j]
            if (current > grid[i-1][j] && current > grid[i][j-1] && current > grid[i+1][j] && current > grid[i][j+1]) {
                grid[i] = grid[i].substring(0, j) + 'X' + grid[i].substring(j+1, grid[i].length)
            }
        }
    }

    return grid
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grid = Array(n) { "" }
    for (i in 0 until n) {
        val gridItem = scan.nextLine()
        grid[i] = gridItem
    }

    val result = cavityMap(grid)
    println(result.joinToString("\n"))
}