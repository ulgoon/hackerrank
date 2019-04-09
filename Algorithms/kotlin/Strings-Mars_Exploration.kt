import java.util.*
import kotlin.io.*

fun marsExploration(s: String): Int {
    val sos = "SOS"
    var result = 0

    s.forEachIndexed { index, c ->
        if(c != sos[index % 3]) result++
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()

    val result = marsExploration(s)
    println(result)
}