import java.util.*
import kotlin.io.*
import kotlin.math.abs

fun makingAnagrams(s1: String, s2: String): Int {

    var map = mutableMapOf<Char, Int>()
    var result = 0

    // 1. s1에 해당하는 값은 map에서 1씩 더한다.
    (0 until s1.length).forEach {
        map[s1[it]] = map.getOrDefault(s1[it], 0) + 1
    }

    // 2. s2에 해당하는 값은 map에서 1씩 뺀다.
    (0 until s2.length).forEach {
        map[s2[it]] = map.getOrDefault(s2[it], 0) - 1
    }

    // 3. map에서 value가 0이 아닌 값을 result에 더한다.
    map.values.forEach { if (it != 0) result += abs(it) }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()
    val s2 = scan.nextLine()

    val result = makingAnagrams(s1, s2)
    println(result)
}