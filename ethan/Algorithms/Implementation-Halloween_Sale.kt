import java.util.*
import kotlin.io.*
import kotlin.math.max
import kotlin.text.*

// Complete the howManyGames function below.
fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {

    var result = 0

    var myS = s
    var myP = p

    while (myP != m) {
        myS -= myP
        if (myS < 0) return result

        myP = max(myP - d, m)
        result++
    }

    result += myS / myP

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val pdms = scan.nextLine().split(" ")
    val p = pdms[0].trim().toInt()
    val d = pdms[1].trim().toInt()
    val m = pdms[2].trim().toInt()
    val s = pdms[3].trim().toInt()

    val answer = howManyGames(p, d, m, s)
    println(answer)
}