import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun maximumPerimeterTriangle(sticks: Array<Int>): Array<Int> {

    // 1. sticks 배열을 내림차순으로 정렬한다.
    sticks.sortDescending()

    // 2. sticks를 탐색하면서 삼각형이 성립되는지 확인한다.
    for (i in 0..sticks.size-3) {
        // 2-1. 삼각형이 된다면 그 값을 반환한다.
        if (sticks[i] < sticks[i+1] + sticks[i+2]) return arrayOf(sticks[i+2], sticks[i+1], sticks[i])
    }

    // 3. 삼각형이 만들어지지 않으면 -1을 반환한다.
    return arrayOf(-1)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val sticks = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = maximumPerimeterTriangle(sticks)
    println(result.joinToString(" "))
}
