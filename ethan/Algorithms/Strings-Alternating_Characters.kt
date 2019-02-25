import java.util.*
import kotlin.io.*
import kotlin.text.*

fun alternatingCharacters(s: String): Int {

    var mString = s
    var result = 0

    var i = 0
    while (i <= mString.length-2) {
        if (mString[i] == mString[i+1]) {
            mString = mString.removeRange(i+1, i+2)
            result++
        } else {
            i++
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}
