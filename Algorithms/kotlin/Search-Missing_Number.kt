import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {

    var map = mutableMapOf<Int, Int>()
    var result = arrayListOf<Int>()

    // 1. brr에 해당하는 값은 map에서 1씩 더한다.
    (0 until brr.size).forEach {
        map[brr[it]] = map.getOrDefault(brr[it], 0) + 1
    }

    // 2. arr에 해당하는 값은 map에서 1씩 뺀다.
    (0 until arr.size).forEach {
        map[arr[it]] = map.getOrDefault(arr[it], 0) - 1
    }

    // 3. map에서 value가 0보다 큰 값을 result에 더한다.
    map.values.forEachIndexed { index, i ->
        if (i > 0) { result.add(map.keys.elementAt(index)) }
    }

    return result.sorted().toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val m = scan.nextLine().trim().toInt()
    val brr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = missingNumbers(arr, brr)
    println(result.joinToString(" "))
}