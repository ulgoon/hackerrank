import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gridChallenge(grid: Array<String>): String {

    // 1. grid의 개별 string을 각각 정렬한다.
    (0 until grid.size).forEach { grid[it] = grid[it].toCharArray().sorted().joinToString("") }

    // 2. grid의 string 길이만큼 반복문을 돌린다.
    (0 until grid[0].length).forEach { i ->
        // 3. grid의 크기-1만큼 반복문을 돌린다.
        (0 until grid.size-1).forEach { j ->
            // 4. 같은 열의 문자를 비교하여 앞문자가 뒷문자보다 크면 "NO"를 반환한다.
            if (grid[j][i] > grid[j+1][i]) return "NO"
        }
    }

    // 5. 4에서 종료되지 않았으면 "YES"를 반환한다.
    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val grid = Array(n) { "" }
        for (i in 0 until n) {
            val gridItem = scan.nextLine()
            grid[i] = gridItem
        }

        val result = gridChallenge(grid)
        println(result)
    }
}