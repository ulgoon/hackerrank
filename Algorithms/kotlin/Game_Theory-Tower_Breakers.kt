import java.util.*
import kotlin.io.*
import kotlin.text.*

fun towerBreakers(n: Int, m: Int): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nm = scan.nextLine().split(" ")
        val n = nm[0].trim().toInt()
        val m = nm[1].trim().toInt()

        val result = towerBreakers(n, m)
        println(result)
    }
}