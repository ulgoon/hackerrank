import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the larrysArray function below.
fun larrysArray(A: Array<Int>): String {

    return "NO"
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