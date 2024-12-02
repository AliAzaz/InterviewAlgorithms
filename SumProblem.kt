/*
* Sum Problem:
* If the sum of digits of input number is greater than 9 then split that sum amount again like:
* 75 -> 7 + 5 = 12 -> 1 + 2 = 3 -> 3 so, 3 is the answer
* */

fun main() {
    println(sumProblem(751))
}

fun sumProblem(no: Int, flow: String = ""): Int {
    return if (no <= 9) {
        no
    } else {
        val item = no.toString()
        val sum = item[0].digitToInt() + item[1].digitToInt()
        var str = flow
        str += "${item[0]} + ${item[1]} = $sum -> "
        return sumProblem(sum, str)
    }
}

fun sumProblem02(no: Int): Int {
    return if (no < 10) no
    else {
        var lastElement = no % 10
        val firstDigit = (no / 10)
        print("$firstDigit+$lastElement")
        lastElement += firstDigit
        print("->$lastElement\n")
        sumProblem(lastElement)
    }
}