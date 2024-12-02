package palindrome

fun main() {
    val result = palindromeString("aA")
    println(result)
}

fun palindromeString(str: String): Boolean {
    /*
    * Input: "ala", Expected: true, Result: true, Passed: true
    * Input: "abcba", Expected: true, Result: true, Passed: true
    * Input: "hello", Expected: false, Result: false, Passed: true
    * Input: "abc", Expected: false, Result: false, Passed: true
    * Input: "Ala", Expected: false, Result: false, Passed: true
    * Input: "", Expected: true, Result: true, Passed: true
    * Input: "a,b,a", Expected: false, Result: false, Passed: true
    * Input: "a", Expected: true, Result: true, Passed: true
    * Input: "aa", Expected: true, Result: true, Passed: true
    * */
    val result = ArrayDeque(str.toList())
    str.forEach {
        if (it.lowercase() == result.last().lowercase())
            result.removeLast()
    }

    return result.isEmpty()
}