import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {

    return "0"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()
    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)
    println(result)
}