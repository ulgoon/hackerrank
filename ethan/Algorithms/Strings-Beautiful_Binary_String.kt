import java.util.*
import kotlin.io.*
import kotlin.text.*

fun beautifulBinaryString(b: String): Int {

    // 1. string b에서 "010"이 나오는 횟수를 찾는다.
    // 1-1. "010"이 나오면 공백("")으로 변경하고 그 길이를 구한다.
    // 1-2. string b의 길이에서 1-1에서 구한 값을 뺀다.
    // 1-3. 1-2에서 구한 값을 3으로 나누면 "010"의 개수와 같다.
    (b.length - b.replace("010", "").length).let { return it / 3 }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val b = scan.nextLine()

    val result = beautifulBinaryString(b)
    println(result)
}