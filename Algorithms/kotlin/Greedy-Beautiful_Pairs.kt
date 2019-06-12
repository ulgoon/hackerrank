import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun beautifulPairs(A: Array<Int>, B: Array<Int>): Int {

    var map = mutableMapOf<Int, Int>()
    var result = 0

    // 1. brr에 해당하는 값은 map에서 1씩 더한다.
    (0 until A.size).forEach {
        map[A[it]] = map.getOrDefault(A[it], 0) + 1
    }

    // 2. arr에 해당하는 값은 map에서 1씩 뺀다.
    (0 until B.size).forEach {
        if (map.getOrDefault(B[it],0) > 0) {
            map[B[it]] = map.getValue(B[it]) - 1
            result++
        }
    }

    // 3. 반드시 하나의 값을 변경해야하므로 A.size보다 작은 결과를 가지면 + 1
    // 그렇지 않으면 -1의 결과를 반환한다.
    return if (result < A.size) result + 1
    else result - 1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = beautifulPairs(A, B)
    println(result)
}