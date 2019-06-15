import kotlin.io.*
import kotlin.text.*

fun decentNumber(n: Int): Unit {

}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        decentNumber(n)
    }
}