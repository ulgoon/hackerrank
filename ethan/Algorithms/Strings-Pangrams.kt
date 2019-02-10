import java.util.*
import kotlin.io.*

fun pangrams(s: String): String {
           
    return "not pangram"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = pangrams(s)

    println(result)
}