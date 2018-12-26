import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {

    // no obstacle cases

    // Space in 4 directions
    var up = n - r_q
    var down = r_q - 1
    var left = c_q - 1
    var right = n - c_q

    // Space in the diagonal directions
    var up_left = minOf(up, left)
    var down_left = minOf(down, left)
    var down_right = minOf(down, right)
    var up_right = minOf(up, right)

    for (obstacle in obstacles) {
        
        // Check obstacles in 4 directions
        if (obstacle[0] == r_q) {
            if (obstacle[1] < c_q) {
                left -= obstacle[1]
            } else {
                right -= (n - (obstacle[1] - 1))
            }
        } else if (obstacle[1] == c_q) {
            if (obstacle[0] < r_q) {
                down -= obstacle[0]
            } else {
                up -= (n - (obstacle[0] - 1))
            }
        }

        // Check obstacles in diagonal directions
        else if (abs(obstacle[0] - r_q) == abs(obstacle[1] - c_q)) {

            var diff = abs(obstacle[1] - c_q)

            if (obstacle[0] < r_q) {
                if (obstacle[1] < c_q) down_left = diff - 1
                else down_right = diff - 1
            } else {
                if (obstacle[1] < c_q) up_left = diff - 1
                else up_right = diff - 1
            }
        }
    }

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