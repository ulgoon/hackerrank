import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun insertionSort1(n: Int, arr: Array<Int>): Unit {

    var i = n - 1
    var target = arr[i]
    while (i > 0 && arr[i-1] > target) {
        arr[i] = arr[i-1]
        println(arr.joinToString(' '.toString()))
        i--
    }
    arr[i] = target
    println(arr.joinToString(' '.toString()))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    insertionSort1(n, arr)
}