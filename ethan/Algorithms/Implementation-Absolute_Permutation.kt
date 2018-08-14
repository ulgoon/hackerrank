import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the absolutePermutation function below.
fun absolutePermutation(n: Int, k: Int): Array<Int> {

    var result = Array(n) {0}

    if (k == 0) {
        for (i in 1..n) {
            result[i-1] = i
        }
        return result

    } else if (n % k != 0 || n / k % 2 != 0) {
        return arrayOf(-1)
    }

    for (i in 0 until n) {
        if ((i / k) % 2 == 0) {
            result[i] = i+1 + k
        } else {
            result[i] = i+1 - k
        }
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")
        val n = nk[0].trim().toInt()
        val k = nk[1].trim().toInt()

        val result = absolutePermutation(n, k)
        println(result.joinToString(" "))
    }
}