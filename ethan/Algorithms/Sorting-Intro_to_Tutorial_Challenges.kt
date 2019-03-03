import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun introTutorial(V: Int, arr: Array<Int>): Int {

    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val V = scan.nextLine().trim().toInt()
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = introTutorial(V, arr)
    println(result)
}