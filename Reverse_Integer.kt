/*
* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:

Input: x = 123
Output: 321
*
* */

fun main() {
    /*
    * -2147483412
    * 1534236469
    * 2147483647
    * -32156
    * */
    println(reverse(-2147483412))
}

fun reverse(x: Int): Int {
    var no = if (x > 0) x else x * -1
    var res = 0
    while (no > 0) {
        if (900000000 < res) return 0
        val digit = no % 10
        no /= 10

        res = if (res == 0) digit
        else res * 10 + digit

        if (res < 0) return 0
    }
    return if (x > 0) res else res * -1
}