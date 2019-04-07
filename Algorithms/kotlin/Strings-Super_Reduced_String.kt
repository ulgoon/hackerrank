import kotlin.io.*

fun superReducedString(s: String): String {

    var mString = s
    var i = 0
    while (i <= mString.length-2) {
        if (mString[i] == mString[i+1]) {
            mString = mString.removeRange(i, i+2)
            i = 0
        } else {
            i++
        }
    }

    if (mString.isEmpty())
        mString = "Empty String"

    return mString
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}