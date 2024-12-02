/*
* Write a function:
fun solution(A: IntArray): Int
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
*
* */


fun main() {
    println(solution02(intArrayOf(-1, -3)))
}


fun solution01(A: IntArray): Int {
    val item = A
    item.sort()

    for (i in item.indices) {
        if (item[i] > 0) {
            if (i != item.size - 1 && (item[i + 1] - item[i] > 1)) {
                return item[i] + 1
            }
        }
    }
    item[item.size - 1].apply { return if (this <= 0) 1 else this + 1 }
}

fun solution02(A: IntArray): Int {
    var counter = 1
    A.toSortedSet()

    for (i in A.indices) {
        if (A[i] == counter) counter++
    }
    return counter
}