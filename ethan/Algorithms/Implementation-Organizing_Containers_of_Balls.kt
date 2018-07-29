import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the organizingContainers function below.
fun organizingContainers(container: Array<Array<Int>>): String {

    var row = Array(container.count()) {0}
    var col = Array(container.count()) {0}

    for (i in container.indices) {
        row[i] = container[i].sum()

        for (j in container[i].indices) {
            col[j] += container[i][j]
        }
    }

    row.sort()
    col.sort()

    if (Arrays.toString(row) == Arrays.toString(col))
        return "Possible"

    return "Impossible"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()
    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toInt()

        val container = Array(n) { Array(n) { 0 } }
        for (i in 0 until n) {
            container[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
        }

        val result = organizingContainers(container)
        println(result)
    }
}