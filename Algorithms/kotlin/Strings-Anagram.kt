import java.util.*
import kotlin.io.*
import kotlin.text.*

fun anagram(s: String): Int {

    // 1. 입력받은 문자열은 반으로 나누어 s1, s2에 할당한다.
    val s1 = s.substring(0, s.length / 2)
    var s2 = s.substring(s.length / 2, s.length)
    var result = 0

    // 2. 두 문자열의 길이가 다르면 -1을 출력한다.
    if (s1.length != s2.length) return -1

    // 3. s1의 값이 s2에 있다면 해당 값을 공백으로 변경한다.
    // 3-1. 값이 없으면 result에 1을 더한다.
    (0 until s.length/2).forEach {
        if (s2.contains(s1[it])) s2 = s2.replaceFirst(s1[it], ' ')
        else result++
    }

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