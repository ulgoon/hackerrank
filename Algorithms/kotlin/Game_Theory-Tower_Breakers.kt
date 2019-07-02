import java.util.*
import kotlin.io.*
import kotlin.text.*

fun towerBreakers(n: Int, m: Int): Int {

    // 1-1. 높이가 1인 타워는 player2가 승리한다.
    // 1-2. 타워의 개수가 홀수이면 player1이 승리한다.
    return if ((m == 1) or (n % 2 == 0)) 2
    else 1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nm = scan.nextLine().split(" ")
        val n = nm[0].trim().toInt()
        val m = nm[1].trim().toInt()

        val result = towerBreakers(n, m)
        println(result)
    }
}
