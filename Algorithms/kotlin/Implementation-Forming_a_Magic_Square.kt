import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.text.*

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {

    val base = arrayOf(
            arrayOf(arrayOf(8, 1, 6), arrayOf(3, 5, 7), arrayOf(4, 9, 2)),
            arrayOf(arrayOf(4, 3, 8), arrayOf(9, 5, 1), arrayOf(2, 7, 6)),
            arrayOf(arrayOf(6, 7, 2), arrayOf(1, 5, 9), arrayOf(8, 3, 4)),
            arrayOf(arrayOf(2, 9, 4), arrayOf(7, 5, 3), arrayOf(6, 1, 8)),
            arrayOf(arrayOf(4, 9, 2), arrayOf(3, 5, 7), arrayOf(8, 1, 6)),
            arrayOf(arrayOf(2, 7, 6), arrayOf(9, 5, 1), arrayOf(4, 3, 8)),
            arrayOf(arrayOf(8, 3, 4), arrayOf(1, 5, 9), arrayOf(6, 7, 2)),
            arrayOf(arrayOf(6, 1, 8), arrayOf(7, 5, 3), arrayOf(2, 9, 4))
    )

    var sum = Array(8) { 0 }

    for (i in 0 until 3) {

        for (j in 0 until 3) {

            for (k in 0 until 8) {
                sum[k] += abs(s[i][j] - base[k][i][j])
            }
        }
    }
    sum.sort()

    return sum.first()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array(3) { Array(3) { 0 } }
    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)
    println(result)
}