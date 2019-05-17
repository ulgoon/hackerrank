import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {

    var impContest = mutableListOf<Int>()
    var luck = 0

    // 1. 대회 배열을 탐색한다.
    contests.forEach {
        // 1-1. 중요 대회 리스트를 뽑아낸다.
        if (it[1] == 1) impContest.add(it[0])

        // 1-2. 전체 운 값을 더한다.
        luck += it[0]
    }

    // 2. 중요 대회 리스트를 오름차순으로 정렬한다.
    impContest.sort()

    // 3. 중요 대회 리스트 중 k 값을 제외한 만큼 리스트를 탐색한다.
    (0 until impContest.size - k).forEach {
        // 3-1. 전체 운 값에서 해당 운 값을 제외한다.
        luck -= 2 * impContest[it] }

    return luck
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")
    val n = nk[0].trim().toInt()
    val k = nk[1].trim().toInt()

    val contests = Array(n) { Array(2) { 0 } }

    for (i in 0 until n) {
        contests[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = luckBalance(k, contests)
    println(result)
}