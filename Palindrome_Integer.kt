/*
* Given an integer x, return true if x is a palindrome, and false otherwise.
*
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Follow up: Could you solve it without converting the integer to a string?
* */

fun main() {
    println(isPalindrome(1001))
}

fun isPalindrome(x: Int): Boolean {
    var no = x
    var res = 0
    while (no > 0) {
        val digit = no % 10
        res = res * 10 + digit
        no /= 10
    }
    return res == x
}