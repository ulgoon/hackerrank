import java.util.*
import kotlin.io.*
import kotlin.text.*

fun anagram(s: String): Int {

    // 1. 입력받은 문자열은 반으로 나누어 s1, s2에 할당한다.
    val s1 = s.substring(0, s.length / 2)
    var s2 = s.substring(s.length / 2, s.length)
    var map = mutableMapOf<Char, Int>()
    var result = 0

    // 2. 두 문자열의 길이가 다르면 -1을 출력한다.
    if (s1.length != s2.length) return -1

    // 3. s1에 해당하는 값은 map에서 1씩 더한다.
    // 3-1. s2에 해당하는 값은 map에서 1씩 뺀다.
    (0 until s.length/2).forEach {
        map[s1[it]] = map.getOrDefault(s1[it], 0) + 1
        map[s2[it]] = map.getOrDefault(s2[it], 0) - 1
    }

    // 4. map에서 value가 양수인 값은 result에 더한다.
    map.values.forEach { if (it > 0) result += it }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = anagram(s)
        println(result)
    }
}