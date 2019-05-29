import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun jimOrders(orders: Array<Array<Int>>): Array<Int> {

    return arrayOf(0)
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