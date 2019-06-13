import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun largestPermutation(k: Int, arr: Array<Int>): Array<Int> {

    // 1. 숫자의 위치를 저장할 배열을 만든다.
    var lo = Array(arr.size + 1) {0}
    arr.forEachIndexed { index, i -> lo[i - 1] = index }

    // 2. 교환 횟수를 저장할 변수를 만든다.
    var numberOfExchange = 0

    // 3. break와 같은 역할을 할 수 있도록 run에 라벨을 씌운다.
    run loop@{
        // 4. 배열의 크기만큼 반복문을 실행한다.
        (0 until arr.size).forEach { i ->
            // 5. 이미 제자리 있는 숫자라면 continue의 역할을 하는 return@forEach를 사용한다.
            if (arr[i] == arr.size - i) return@forEach

            // 6. 정렬되어 있지 않은 수 중 가장 큰 값을 선택한다.
            val targetIndex = arr.size - i - 1

            // 7. 가장 큰 값과 현재 인덱스의 값을 교환한다.
            arr[lo[targetIndex]] = arr[i]
            lo[arr[i] - 1] = lo[targetIndex]
            arr[i] = arr.size - i
            lo[targetIndex] = i

            // 8. k번 만큼 교환이 되었다면 return@loop를 통해 forEach를 벗어난다.
            if (++numberOfExchange == k) return@loop
        }
    }

    return arr
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = largestPermutation(k, arr)
    println(result.joinToString(" "))
}