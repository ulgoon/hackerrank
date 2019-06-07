import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun jimOrders(orders: Array<Array<Int>>): Array<Int> {

    var serveTime = hashMapOf<Int, Int>()

    // 1. orders의 index를 이용한 반복문을 수행한다.
    orders.forEachIndexed { index: Int, ints: Array<Int> ->
        // 1-1. 내부 배열의 값을 더해 1차원 배열로 만든다.
        serveTime[index+1] = ints[0] + ints[1]
    }

    // 2. value를 기준으로 정렬하여 결과를 반환한다.
    return serveTime.toList().sortedBy { (key, value) -> value }.toMap().keys.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val orders = Array(n) { Array(2) { 0 } }

    for (i in 0 until n) {
        orders[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = jimOrders(orders)
    println(result.joinToString(" "))
}