/*
* Sum Problem:
* If the sum of digits of input number is greater than 9 then split that sum amount again like:
* 75 -> 7 + 5 = 12 -> 1 + 2 = 3 -> 3 so, 3 is the answer
* */

fun main() {
    println(sumProblem(75))
}

fun sumProblem(no: Int, flow: String = ""): Int {
    return if (no <= 9) {
        println("$flow$no")
        no
    } else {
        val item = no.toString()
        val sum = item[0].digitToInt() + item[1].digitToInt()
        var str = flow
        str += "${item[0]} + ${item[1]} = $sum -> "
        return sumProblem(sum, str)
    }
}