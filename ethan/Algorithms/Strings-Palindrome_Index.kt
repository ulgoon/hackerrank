import java.util.*
import kotlin.io.*
import kotlin.text.*

fun palindromeIndex(s: String): Int {

    // 1. String 길이의 반만큼 반복문을 돌린다.
    (0 until s.length / 2).forEach {
        // 1-1. 앞에서부터 나열되는 인덱스와 뒤에서부터 나열되는 인덱스의 값이 서로 다를 경우,
        if (s[it] != s[s.length - 1 - it]) {
            val ss = s.substring(it, s.length - 1 - it)

            // 1-2. 뒤 값을 제외한 스트링이 palindrome이면 뒤 인덱스를 반환한다.
            return if(ss == ss.reversed()) s.length - 1 - it

            // 1-3. 그렇지 않으면 앞 인덱스를 반환한다.
            else it
        }
    }

    // 이미 palindrome이면 -1을 반환한다.
    return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = palindromeIndex(s)
        println(result)
    }
}