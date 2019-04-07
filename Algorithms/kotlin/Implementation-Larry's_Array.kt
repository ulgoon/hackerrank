import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the larrysArray function below.
fun larrysArray(A: Array<Int>): String {

    var result = 0

    for (i in 0 until A.size-1) {
        for (j in i+1 until A.size) {
            if (A[i] > A[j]) result++
        }
    }

    return if (result % 2 == 0) {
        "YES"
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()
        val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = larrysArray(A)
        println(result)
    }
}