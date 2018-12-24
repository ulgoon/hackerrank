import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {

    var up = n - r_q
    var down = r_q - 1
    var left = c_q - 1
    var right = n - c_q

    var up_left = minOf(up, left)
    var down_left = minOf(down, left)
    var down_right = minOf(down, right)
    var up_right = minOf(up, right)

    return up + down + left + right + up_left + down_left + down_right + up_right
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val r_qC_q = scan.nextLine().split(" ")
    val r_q = r_qC_q[0].trim().toInt()
    val c_q = r_qC_q[1].trim().toInt()

    val obstacles = Array<Array<Int>>(k) { Array<Int>(2) { 0 } }

    for (i in 0 until k) {
        obstacles[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    println(result)
}