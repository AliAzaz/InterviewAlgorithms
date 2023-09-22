/*
* You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

* */

fun main() {
    val first = ListNode(1)
    first.next = ListNode(2)
    first.next!!.next = ListNode(4)

    val second = ListNode(1)
    second.next = ListNode(3)
    second.next!!.next = ListNode(4)

    println(first)
    println(second)

    val result = Solution.mergeTwoLists( first, second)
    println(result)

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

object Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        return if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        }
    }
}