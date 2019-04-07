import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the fairRations function below.
fun fairRations(B: Array<Int>): String {

    var count = 0

    for (i in B.indices) {
        if (B[i] % 2 == 1 && i != B.size - 1) {
            count += 2
            B[i]++
            B[i + 1]++
        }
    }
    
    return if (B.last() % 2== 0) {
        count.toString()
    } else {
        "NO"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()
    val B = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = fairRations(B)
    println(result)
}