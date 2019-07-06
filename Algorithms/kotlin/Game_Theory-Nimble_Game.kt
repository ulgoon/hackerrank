import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun nimbleGame(s: Array<Int>): String {

    var nim = 0

    // 1. 돌의 개수가 홀수인 인덱스 값을 xor하여 균형상태인지 확인한다.
    s.forEachIndexed { index, i ->
        if ( i % 2 == 1) {
            nim = nim.xor(index)
        }
    }

    // 2. 균형상태라면 Second가 승리한다.
    return if (nim == 0) "Second"
    else "First"
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