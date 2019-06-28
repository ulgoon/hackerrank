import java.util.*
import kotlin.io.*
import kotlin.text.*

fun gameOfStones(n: Int): String {

    // 1. 돌의 개수를 7로 나누었을 때, 나머지가 0 또는 1일 경우 Second가 이긴다.
    return when (n % 7) {
        0, 1 -> "Second"
        else -> "First"
    }
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