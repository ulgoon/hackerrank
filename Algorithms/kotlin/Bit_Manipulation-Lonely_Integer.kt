import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun lonelyinteger(a: Array<Int>): Int {

    // 1. 결과를 저장할 변수를 생성한다.
    var result = 0

    // 2. bit 연산자인 xor을 이용하여 같은 값을 지운다.
    a.forEach { result = result xor it }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = lonelyinteger(a)
    println(result)
}