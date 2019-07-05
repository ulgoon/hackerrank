import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun misereNim(s: Array<Int>): String {

    // 1. 돌의 개수와 전체 pile의 개수가 같다면 모든 파일에 1개의 돌이 있는 것이다.
    // 1-1. 따라서, 홀수면 Second가 승리한다.
    s.reduce { acc, i -> acc + i }.let {
        if (it == s.size) {
            return when(it % 2) {
                0 -> "First"
                else -> "Second"
            }
        }
    }

    // 2. 일반적인 Nim game의 승자와 패자가 반대가 된다. 따라서 값이 0이면 Second가 승리한다.
    s.reduce { acc, i -> acc xor i }.let {
        return when(it) {
            0 -> "Second"
            else -> "First"
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (gItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val s = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = misereNim(s)
        println(result)
    }
}