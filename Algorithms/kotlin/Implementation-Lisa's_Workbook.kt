import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the workbook function below.
fun workbook(n: Int, k: Int, arr: Array<Int>): Int {

    var specialProblem = 0
    var page = 1

    arr.forEach {
        var temp = it
        var startValue = 1

        while (temp > 0) {

            var endValue = if (temp >= k) {
                startValue + k
            } else {
                startValue + temp
            }

            if (page in startValue until endValue) {
                specialProblem++
            }

            temp -= k
            startValue += k
            page++
        }
    }

    return specialProblem
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = workbook(n, k, arr)
    println(result)
}