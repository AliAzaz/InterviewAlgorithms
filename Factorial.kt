fun main() {
    println(findingFactorial(5))
    println(findingFactorial_02(5))
}

fun findingFactorial(no: Int): Int {
    return when (no) {
        0, 1 -> 1
        else -> no * findingFactorial(no - 1)
    }
}

fun findingFactorial_02(no: Int): Int {
    var result = 1
    for (i: Int in no.downTo(1)) {
        result *= i
    }
    return result
}