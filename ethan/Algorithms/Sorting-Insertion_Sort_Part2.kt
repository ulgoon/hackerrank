import java.util.*
import kotlin.collections.*
import kotlin.text.*

fun insertionSort2(n: Int, arr: Array<Int>): Unit {

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    insertionSort2(n, arr)
}