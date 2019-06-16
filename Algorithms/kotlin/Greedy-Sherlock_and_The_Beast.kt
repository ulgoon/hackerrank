import kotlin.io.*
import kotlin.text.*

fun decentNumber(n: Int): Unit {

    var number = n

    // 1. number에서 5씩 빼는 것을 반복하면서 나머지가 3으로 나누어 떨어지는지 확인한다.
    while (number % 3 != 0) {
        number -= 5
        // 2. 3의 배수와 5의 배수의 합으로 이루어지지 않은 경우는 -1을 출력한다.
        if (number < 0) {
            println(-1)
            return
        }
    }

    // 3. 5를 '1'에서 구한 number만큼, 3을 n - number만큼 출력한다.
    println(5.toString().repeat(number) + 3.toString().repeat(n-number))
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        decentNumber(n)
    }
}