import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {

    // 1. arr를 탐색하며 인덱스를 선택하고
    (0 until arr.size).forEach {
        // 1-1. 선택한 인덱스를 it라고 했을 때, m에서 arr[it]를 뺀 값이 arr의 나머지 부분에서 있는지 확인한다.
        // 1-2. 있다면, it+1 값과 arr[it2] = m-arr[it]를 만족하는 it2+1 값을 출력한다.
        if (m - arr[it] in arr.sliceArray(it+1 until arr.size)) return arrayOf(it+1, arr.sliceArray(it+1 until arr.size).indexOf(m - arr[it]) + it + 2)
    }

    return arrayOf(0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val m = scan.nextLine().trim().toInt()
        val n = scan.nextLine().trim().toInt()
        val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)
        println(result.joinToString(" "))
    }
}