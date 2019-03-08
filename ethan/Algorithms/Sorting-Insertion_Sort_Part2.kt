import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun insertionSort2(n: Int, arr: Array<Int>): Unit {

    (1 until n).forEach loop@{
        (it.downTo(1)).forEach { index ->
            if(arr[index] < arr[index-1]) {
                arr[index] = arr[index-1].also { arr[index-1] = arr[index] }
            } else {
                println(arr.joinToString(' '.toString()))
                return@loop
            }
            
            if (index == 1) {
                println(arr.joinToString(' '.toString()))
            }
        }
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    insertionSort2(n, arr)
}