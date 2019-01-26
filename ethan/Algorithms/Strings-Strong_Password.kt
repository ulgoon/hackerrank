import java.util.*
import kotlin.io.*
import kotlin.text.*

fun minimumNumber(n: Int, password: String): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val password = scan.nextLine()

    val answer = minimumNumber(n, password)
    println(answer)
}