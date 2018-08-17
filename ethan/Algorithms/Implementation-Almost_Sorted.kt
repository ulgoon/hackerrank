import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the almostSorted function below.
fun almostSorted(arr: Array<Int>): Unit {

    var sortedArr = arr.copyOf()
    sortedArr.sort()

    var first = 0
    var last = arr.size - 1

    while (first < arr.size - 2 && arr[first] < arr[first + 1]) first++
    while (last > 0 && arr[last - 1] < arr[last]) last--

    // swap
    arr[first] = arr[last].also { arr[last] = arr[first] }

    if (Arrays.toString(sortedArr) == Arrays.toString(arr)) {
        println("yes")
        println("swap ${first+1} ${last+1}")
        return
    }

    // reverse
    arr.sort(first+1, last)

    if (Arrays.toString(sortedArr) == Arrays.toString(arr)) {
        println("yes")
        println("reverse ${first+1} ${last+1}")
        return
    }

    println("no")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    almostSorted(arr)
}