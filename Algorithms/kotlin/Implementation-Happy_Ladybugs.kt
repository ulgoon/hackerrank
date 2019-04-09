import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the happyLadybugs function below.
fun happyLadybugs(b: String): String {

    var groupb = b.groupBy { it }
    var keys = groupb.keys

    keys.forEach {
        if (groupb[it]?.count()!! < 2 && it != '_') {
            return "NO"
        }
    }

    if (groupb['_'] == null) {
        var already = mutableListOf<Char>()
        for (i in 0 until b.length-1) {
            if (b[i] != b[i+1]) {
                if (b[i] in already) {
                    return "NO"
                } else {
                    already.add(b[i])
                }
            }
        }
    }

    return "YES"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val g = scan.nextLine().trim().toInt()

    for (gItr in 1..g) {
        val n = scan.nextLine().trim().toInt()
        val b = scan.nextLine()

        val result = happyLadybugs(b)
        println(result)
    }
}