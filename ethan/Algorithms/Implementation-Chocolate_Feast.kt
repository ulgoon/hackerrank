import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the chocolateFeast function below.
fun chocolateFeast(n: Int, c: Int, m: Int): Int {

    var chocolate = n / c
    var wrapper = chocolate

    while (wrapper >= m) {
        chocolate += wrapper / m
        wrapper = wrapper / m + wrapper % m
    }

    return chocolate
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val ncm = scan.nextLine().split(" ")
        val n = ncm[0].trim().toInt()
        val c = ncm[1].trim().toInt()
        val m = ncm[2].trim().toInt()

        val result = chocolateFeast(n, c, m)
        println(result)
    }
}