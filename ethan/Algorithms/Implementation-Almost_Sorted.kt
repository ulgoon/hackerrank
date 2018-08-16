import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the almostSorted function below.
fun almostSorted(arr: Array<Int>): Unit {

    var sortedArr = arr.copyOf()
    sortedArr.sort()

    var first = 0
    var last = arr.size-1

    for (i in 0 until arr.size-1) {
        if (arr[i] > arr[i + 1]) {
            first = i
            break
        }
    }

    for (j in arr.size-1 downTo 1) {
        if (arr[j - 1] > arr[j]) {
            last = j
            break
        }
    }

    arr[first] = arr[last].also { arr[last] = arr[first] }

    if (Arrays.toString(sortedArr) == Arrays.toString(arr)) {
        println("yes")
        println("swap ${first+1} ${last+1}")
    } else {
        println("no")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    almostSorted(arr)
}