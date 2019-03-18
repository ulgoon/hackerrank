import java.util.*
import kotlin.text.*

fun separateNumbers(s: String): Unit {

    for (i in 1..s.length/2) {
        var baseNumber = s.substring(0, i).toLong()
        var testString = baseNumber.toString()
        var increase = 1

        while (testString.length < s.length) {
            testString += (baseNumber + increase).toString()
            increase++
        }

        if (testString == s) {
            println("YES $baseNumber")
            return
        }
    }

    println("NO")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()
        separateNumbers(s)
    }
}