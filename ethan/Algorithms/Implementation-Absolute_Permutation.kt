import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the absolutePermutation function below.
fun absolutePermutation(n: Int, k: Int): Array<Int> {

    return arrayOf(0)
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