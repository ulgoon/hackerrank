import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun countingSort(arr: Array<Int>): Array<Int> {

    // 1. 숫자가 0 ~ 99로 고정이라는 조건에 따라 size가 100인 배열 생성
    var count = Array(100) {0}

    // 2. 입력받은 숫자를 확인하여 해당 배열값 증가
    arr.forEach { count[it]++ }

    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = countingSort(arr)
    println(result.joinToString(" "))
}