import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun quickSort(arr: Array<Int>): Array<Int> {

    // 1. arr[0]을 피봇으로 설정
    var pivot = arr[0]
    var left = mutableListOf<Int>()
    var right = mutableListOf<Int>()

    // 2. arr[1] ~ arr[size-1]까지의 값을 확인
    (1 until arr.size).forEach {

        // 2-1. 피봇보다 작으면 left 리스트에 추가
        if (arr[it] < pivot) left.add(arr[it])
        // 2-2. 피봇보다 크면 right 리스트에 추가
        else if (arr[it] > pivot) right.add(arr[it])
    }

    // 3. left, pivot, right를 순서대로 출력
    return left.toTypedArray() + pivot + right.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = quickSort(arr)
    println(result.joinToString(" "))
}