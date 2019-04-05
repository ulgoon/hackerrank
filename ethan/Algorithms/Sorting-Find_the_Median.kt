import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun findMedian(arr: Array<Int>): Int {

    // 1. 정렬 후 중간 위치의 값을 출력한다.
    arr.sorted().let { return it[arr.size/2] }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = findMedian(arr)
    println(result)
}