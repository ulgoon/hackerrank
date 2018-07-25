import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the biggerIsGreater function below.
fun biggerIsGreater(w: String): String {

    var result = StringBuilder()
    result.append(w)

    for (i in result.lastIndex downTo 1) {
        if (result[i] > result[i-1]) {

            var ch = i

            result.substring(i+1).forEachIndexed { index, c ->
                if ( c < result[ch] && c > result[i-1]) ch = i + 1 + index }
            result[ch] = result[i-1].also { result[i-1] = result[ch] }

            result.replace(i, result.length, result.substring(i).toList().sorted().joinToString(""))

            return result.toString()
        }
    }

    return "no answer"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val T = scan.nextLine().trim().toInt()

    for (TItr in 1..T) {
        val w = scan.nextLine()

        val result = biggerIsGreater(w)
        println(result)
    }
}