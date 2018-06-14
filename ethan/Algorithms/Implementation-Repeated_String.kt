import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    var numberA = 0.toLong()
    s.forEach { if (it == 'a') numberA++ }
    numberA *= (n / s.length)

    var last = s.substring(0, (n % s.length).toInt())
    last.forEach { if (it == 'a') numberA++ }

    return numberA
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()
    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)
    println(result)
}