import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gemstones(arr: Array<String>): Int {
    
    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array(n) { "" }
    for (i in 0 until n) {
        val arrItem = scan.nextLine()
        arr[i] = arrItem
    }

    val result = gemstones(arr)
    println(result)
}