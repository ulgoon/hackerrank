import java.util.*
import kotlin.io.*
import kotlin.math.min
import kotlin.text.*

// Complete the taumBday function below.
fun taumBday(b: Long, w: Long, bc: Int, wc: Int, z: Int): Long {

    val nbc = min(bc, wc + z)
    val nwc = min(wc, bc + z)

    return (b * nbc + w * nwc).toLong()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val bw = scan.nextLine().split(" ")
        val b = bw[0].trim().toLong()
        val w = bw[1].trim().toLong()

        val bcWcz = scan.nextLine().split(" ")
        val bc = bcWcz[0].trim().toInt()
        val wc = bcWcz[1].trim().toInt()
        val z = bcWcz[2].trim().toInt()

        val result = taumBday(b, w, bc, wc, z)
        println(result)
    }
}