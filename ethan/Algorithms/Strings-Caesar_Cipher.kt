import java.util.*
import kotlin.io.*
import kotlin.text.*

fun caesarCipher(s: String, k: Int): String {

    var nAlphabet = 'z' - 'a' + 1
    var result = ""

    for (c in s) {
        result += when {
            c.isLowerCase() -> ((c - 'a' + k) % nAlphabet + 'a'.toInt()).toChar()
            c.isUpperCase() -> ((c - 'A' + k) % nAlphabet + 'A'.toInt()).toChar()
            else -> c
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val s = scan.nextLine()
    val k = scan.nextLine().trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}