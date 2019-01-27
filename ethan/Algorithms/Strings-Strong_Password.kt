import java.util.*
import kotlin.io.*
import kotlin.text.*

fun minimumNumber(n: Int, password: String): Int {
    val special_characters = "!@#$%^&*()-+"
    var result = 0

    if (!password.contains("[0-9]".toRegex())) result++
    if (!password.contains("[a-z]".toRegex())) result++
    if (!password.contains("[A-Z]".toRegex())) result++
    if (!password.contains("[!@#$%^&*()\\-+]".toRegex())) result++
    if (n + result < 6) return 6 - n

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val password = scan.nextLine()

    val answer = minimumNumber(n, password)
    println(answer)
}