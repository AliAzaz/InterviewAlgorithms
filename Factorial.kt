fun main() {
    println(findingFactorial(5))
}

fun findingFactorial(no: Int): Int {
    return when (no) {
        0 -> 1
        1 -> 1
        else -> no * findingFactorial(no - 1)
    }
}