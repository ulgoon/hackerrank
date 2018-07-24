import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the timeInWords function below.
fun timeInWords(h: Int, m: Int): String {

    var letter = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine", "half")

    var result = StringBuilder()

    when (m) {
        0 -> result.append(letter[h] + " o' clock")
        1 -> result.append(letter[m] + " minute past " + letter[h])
        15, 30 -> result.append(letter[m] + " past " + letter[h])
        in 2..29 -> result.append(letter[m] + " minutes past " + letter[h])
        45 -> result.append(letter[60-m] +  " to " + letter[h+1])
        else -> result.append(letter[60-m] +  " minutes to " + letter[h+1])
    }
    return result.toString()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()
    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)
    println(result)
}