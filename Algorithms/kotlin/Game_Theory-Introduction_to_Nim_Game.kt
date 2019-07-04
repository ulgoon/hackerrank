import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun nimGame(pile: Array<Int>): String {

    // 1. Nim 게임의 공략법인 균형상태를 확인한다.
    // 2. pile의 요소를 모두 xor하여 값이 0이 나오면 균형상태이므로, Second가 승리한다.
    pile.reduce { acc, i -> acc xor i }.let {
        return when(it) {
            0 -> "Second"
            else -> "First"
        }
    }
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