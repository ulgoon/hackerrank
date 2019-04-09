import java.util.*
import kotlin.io.*

// Complete the camelcase function below.
fun camelcase(s: String): Int {

    var capital = 1
    
    s.forEach { if (it.isUpperCase()) capital++ }
    
    return capital
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)
    println(result)
}