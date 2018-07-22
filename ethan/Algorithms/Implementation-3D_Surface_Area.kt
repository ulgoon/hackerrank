import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the surfaceArea function below.
fun surfaceArea(A: Array<Array<Int>>): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val HW = scan.nextLine().split(" ")
    val H = HW[0].trim().toInt()
    val W = HW[1].trim().toInt()

    val A = Array<Array<Int>>(H, { Array<Int>(W, { 0 }) })
    for (i in 0 until H) {
        A[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = surfaceArea(A)
    println(result)
}
