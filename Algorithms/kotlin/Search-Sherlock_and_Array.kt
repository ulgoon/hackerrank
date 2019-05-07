import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun balancedSums(arr: Array<Int>): String {

    // 1. 배열의 크기가 1이면 "YES"를 리턴한다.
    if (arr.size == 1) return "YES"

    // 2. 왼쪽 배열의 합과 오른쪽 배열의 합을 저장할 변수를 생성한다.
    var left = 0
    var right = arr.sum() - arr[0]

    // 3. 배열을 탐색하면서 왼쪽 배열의 합과 오른쪽 배열의 합이 같은지 확인한다.
    (0 until arr.size - 1).forEach {
        if (left == right) return "YES"

        // 3-1. 왼쪽 배열에 하나의 값을 추가하고, 오른쪽 배열에 하나의 값을 제거한다.
        left += arr[it]
        right -= arr[it+1]
    }

    return "NO"
}

fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val n = readLine()!!.trim().toInt()
        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = balancedSums(arr)
        println(result)
    }
}