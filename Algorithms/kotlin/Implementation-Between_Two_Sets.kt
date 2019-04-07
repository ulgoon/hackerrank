import java.util.*

/*
 * Complete the getTotalX function below.
 */
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var result = 0

    var a_lcm = 1
    for (i in a) {
        a_lcm = lcm(i, a_lcm)
    }

    var b_gcd = 0
    for (i in b) {
        b_gcd = gcd(i, b_gcd)
    }

    for (i in 1..b_gcd/a_lcm) {
        if (b_gcd % (a_lcm * i) == 0) result++
    }

    return result
}

fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int) = a * b / gcd(a, b)

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")
    val n = nm[0].trim().toInt()
    val m = nm[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val b = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val total = getTotalX(a, b)
    println(total)
}