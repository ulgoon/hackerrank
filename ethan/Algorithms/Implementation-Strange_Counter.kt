import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the strangeCounter function below.
fun strangeCounter(t: Long): Long {

    var count = 3.toLong()
    var start = 1.toLong()

    while (true) {

        var end = start + count - 1
        if (t in start..end) {
            return 1 + end - t
        }

        count *= 2
        start = end + 1
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toLong()

    val result = strangeCounter(t)
    println(result)
}