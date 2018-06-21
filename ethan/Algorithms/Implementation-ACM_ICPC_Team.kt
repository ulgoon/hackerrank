import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the acmTeam function below.
fun acmTeam(topic: Array<String>): Array<Int> {
    val binaryTopic = topic.map { it.toBigDecimal() }
    var result = arrayOf(0, 0)
    
    for (i in topic.indices) {
        for (j in i+1 until topic.size) {
            var count = 0
            (binaryTopic[i] + binaryTopic[j]).toString().forEach { if(it != '0') count++ }
            if (count > result[0]) {
                result[0] = count
                result[1] = 1
            } else if (count == result[0]){
                result[1]++
            }
        }
    }

    return result

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")
    val n = nm[0].trim().toInt()
    val m = nm[1].trim().toInt()

    val topic = Array<String>(n, { "" })
    for (i in 0 until n) {
        val topicItem = scan.nextLine()
        topic[i] = topicItem
    }

    val result = acmTeam(topic)
    println(result.joinToString("\n"))
}