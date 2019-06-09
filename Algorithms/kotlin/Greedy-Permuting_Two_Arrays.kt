import java.util.*
import kotlin.collections.*
import kotlin.io.*

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {

    // 1. A를 오름차순으로, B를 내림차순으로 정렬한다.
    A.sort()
    B.sortDescending()

    // 2. 같은 인덱스에 해당하는 값을 더하여 k와 비교한다.
    for (i in 0 until A.size) {
        if(A[i] + B[i] < k) {
            // 2-1. 더한 값이 k보다 작으면 "NO"를 반환한다.
            return "NO"
        }
    }
    // 2-2. 그렇지않으면 "YES"를 반환한다.
    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val nk = scan.nextLine().split(" ")
        val n = nk[0].trim().toInt()
        val k = nk[1].trim().toInt()

        val A = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        val result = twoArrays(k, A, B)
        println(result)
    }
}