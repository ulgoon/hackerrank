import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the biggerIsGreater function below.
fun biggerIsGreater(w: String): String {

    return "0"
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