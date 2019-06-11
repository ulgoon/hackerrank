import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun minimumAbsoluteDifference(arr: Array<Int>): Int {

    // 1. arr 배열을 오름차순으로 정렬한다.
    arr.sort()

    // 2. 가장 차이가 작은 값을 구하기 위해 가장 큰 값을 일단 할당한다.
    var minimum = arr.last()

    // 3. 근접한 두 수의 차이를 구해 minimum보다 작으면 할당한다.
    (0..arr.size-2).forEach {
        if (minimum > arr[it+1] - arr[it]) minimum = arr[it+1] - arr[it]
    }

    return minimum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)
    println(result)
}