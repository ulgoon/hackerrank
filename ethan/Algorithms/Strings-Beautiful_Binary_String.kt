import java.util.*
import kotlin.io.*
import kotlin.text.*

fun beautifulBinaryString(b: String): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val b = scan.nextLine()

    val result = beautifulBinaryString(b)
    println(result)
}