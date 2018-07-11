import java.util.*
import kotlin.text.*

// Complete the kaprekarNumbers function below.
fun kaprekarNumbers(p: Long, q: Long): Unit {

    var nothing = false
    for (i in p..q) {
        var square = i * i
        var d = square.toString().length

        var left = square.toString().substring(0, d / 2)
        var right = square.toString().substring(d / 2)

        var leftNumber = 0.toLong()
        var rightNumber: Long = 0.toLong()
        if (left.isNotEmpty()) leftNumber = left.toLong()
        if (right.isNotEmpty()) rightNumber = right.toLong()

        if (leftNumber + rightNumber == i) {
            print("$i ")
            nothing = true
        }
    }

    if (!nothing) println("INVALID RANGE")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val p = scan.nextLine().trim().toLong()
    val q = scan.nextLine().trim().toLong()
    kaprekarNumbers(p, q)
}