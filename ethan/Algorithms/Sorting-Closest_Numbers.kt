import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun closestNumbers(arr: Array<Int>): Array<Int> {

    // 1. array를 크기순으로 정렬한다.
    arr.sort()

    // 2. array의 1번 index와 0번 index의 차이를 기준으로한다.
    var min = arr[1] - arr[0]
    var result = mutableListOf<Int>()

    // 3. array를 탐색하면서 차이를 계산하고 min과 비교한다.
    (1..arr.size-2).forEach {

        // 3-1. min보다 작은 경우, result를 수정한다.
        if (min > arr[it+1] - arr[it]) {
            min = arr[it+1] - arr[it]
            result.clear()
            result.add(arr[it])
            result.add(arr[it+1])
        }
        // 3-2. min과 같은 경우, result에 추가한다.
        else if (min == arr[it+1] - arr[it]) {
            result.add(arr[it])
            result.add(arr[it+1])
        }
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = closestNumbers(arr)
    println(result.joinToString(" "))
}