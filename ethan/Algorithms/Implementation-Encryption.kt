import java.util.*
import kotlin.io.*
import kotlin.math.sqrt

// Complete the encryption function below.
fun encryption(s: String): String {

    var row = sqrt(s.length.toDouble()).toInt()
    var col = row
    var blockLength = s.length / col

    if (row * row < s.length) {
        col++
    }

    if (s.length % col > 0) {
        blockLength++
    }

    var result = StringBuilder()

    for (i in 0 until col) {
        for (j in 0 until blockLength) {
            var index = i + col * j
            if (index < s.length) result.append(s[i+col*j])
        }
        result.append(" ")
    }

    return result.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)
    println(result)
}