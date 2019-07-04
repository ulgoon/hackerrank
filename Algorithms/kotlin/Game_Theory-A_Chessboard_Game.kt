import java.util.*
import kotlin.io.*
import kotlin.text.*

fun chessboardGame(x: Int, y: Int): String {

    // 1. 좌표가 (1, 1)에서 부터 시작하기 때문에 (0, 0)으로 보정하기 위해 1을 빼준다.
    /* 
        2. 아래와 같은 패턴이 반복되므로, 4로 나눈 나머지를 이용한다.
            S S F F
            S S F F
            F F F F
            F F F F
    */
    val _x = (x - 1) % 4
    val _y = (y - 1) % 4

    // 3. 좌표값 (0,0), (0,1), (1,0), (1,1) 일 때, Player2가 이긴다.
    return if ((_x < 2) and (_y < 2)) "Second"
    else "First"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val xy = scan.nextLine().split(" ")
        val x = xy[0].trim().toInt()
        val y = xy[1].trim().toInt()

        val result = chessboardGame(x, y)
        println(result)
    }
}