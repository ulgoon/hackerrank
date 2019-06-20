import kotlin.io.*
import kotlin.text.*

fun sumXor(n: Long): Long {

    var value = n
    var result:Long = 1

    // 1. value를 2로 나누면서 1보다 클 경우까지 반복하여 아래의 코드를 수행한다.
    while (value > 1) {
        // 2. value를 2로 나눈 나머지가 0이면 현재 마지막 비트가 0이라는 것을 의미한다.
        if (value.rem(2).toInt() == 0) {
            // 3. 0이 나오는 비트의 개수를 2의 지수로 가지는 결과를 얻을 수 있다.
            result *= 2
        }

        // 4. 오른쪽 쉬프트는 2로 나누는 것과 같은 결과를 갖는다.
        value = value.shr(1)
    }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toLong()

    val result = sumXor(n)
    println(result)
}