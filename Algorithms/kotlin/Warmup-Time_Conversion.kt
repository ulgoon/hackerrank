import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    var result = s.substring(0, s.length - 2)
    
    if(s.contains("PM") && s.split(":")[0] != "12") {
        return (result.split(":")[0].toInt() + 12).toString() + result.substring(2, result.length)
    } else if(s.contains("AM") && s.split(":")[0] == "12") {
        return "00" + result.substring(2, result.length)
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}