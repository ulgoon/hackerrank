import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the gridSearch function below.
fun gridSearch(G: Array<String>, P: Array<String>): String {

    return "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val RC = scan.nextLine().split(" ")
        val R = RC[0].trim().toInt()
        val C = RC[1].trim().toInt()

        val G = Array<String>(R) { "" }
        for (i in 0 until R) {
            val GItem = scan.nextLine()
            G[i] = GItem
        }

        val rc = scan.nextLine().split(" ")
        val r = rc[0].trim().toInt()
        val c = rc[1].trim().toInt()

        val P = Array<String>(r) { "" }
        for (i in 0 until r) {
            val PItem = scan.nextLine()
            P[i] = PItem
        }

        val result = gridSearch(G, P)
        println(result)
    }
}