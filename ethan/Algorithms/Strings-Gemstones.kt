import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun gemstones(arr: Array<String>): Int {
    
    var result = arr[0].toSet()

    // 1. 문자열.toSet()로 갖고 있는 문자를 찾는다.
    // 2. intersect()를 이용하여 공통된 문자를 찾는다.
    for (s in arr) {
        result = result.intersect(s.toSet())
    }

    // 3. 그 개수를 출력한다.
    return result.size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array(n) { "" }
    for (i in 0 until n) {
        val arrItem = scan.nextLine()
        arr[i] = arrItem
    }

    val result = gemstones(arr)
    println(result)
}