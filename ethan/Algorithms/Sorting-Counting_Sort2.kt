import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun countingSort(arr: Array<Int>): Array<Int> {

    // 1. 숫자가 0 ~ 99로 고정이라는 조건에 따라 size가 100인 배열 생성
    var count = Array(100) {0}

    // 2. 입력받은 숫자를 확인하여 해당 배열값 증가
    arr.forEach { count[it]++ }

    // 3. 결과를 저장할 리스트 생성
    var result = mutableListOf<Int>()

    // 4. count 배열의 값을 순차적으로 확인
    count.forEachIndexed { index, i ->
        // 4-1. 배열 index 값을 i만큼 리스트에 저장
        (0 until i).forEach { result.add(index) }
    }

    // 5. 리스트 출력
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = countingSort(arr)
    println(result.joinToString(" "))
}