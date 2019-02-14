import java.util.*
import kotlin.io.*
import kotlin.text.*

fun caesarCipher(s: String, k: Int): String {
    
    return ""
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val s = scan.nextLine()
    val k = scan.nextLine().trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}