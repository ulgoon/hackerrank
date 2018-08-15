import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the almostSorted function below.
fun almostSorted(arr: Array<Int>): Unit {

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    almostSorted(arr)
}