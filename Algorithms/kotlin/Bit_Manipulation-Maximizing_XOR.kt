import java.util.*
import kotlin.io.*
import kotlin.text.*

fun maximizingXor(l: Int, r: Int): Int {

    // 1. l과 r의 xor값을 구한다.
    var value = l xor r
    // 2. 비트값으로 변경하여 '1'이전에 0의 개수를 구한다. (32비트 기준)
    var startbit = 32 - Integer.numberOfLeadingZeros(value)
    // 3. 1을 startbit만큼 왼쪽으로 시프트한 뒤, 1을 뺀 값이 최대값이다.
    var result = 1.shl(startbit) - 1

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val l = scan.nextLine().trim().toInt()
    val r = scan.nextLine().trim().toInt()

    val result = maximizingXor(l, r)
    println(result)
}