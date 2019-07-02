import java.util.*
import kotlin.io.*
import kotlin.text.*

fun chessboardGame(x: Int, y: Int): String {

    return "First"
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