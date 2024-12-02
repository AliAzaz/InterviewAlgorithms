fun main() {

    val linkedList = LinkedList(data = 2)
    insertItemInLinkedListEnd(linkedList, 5)
    insertItemInLinkedListEnd(linkedList, 10)
    insertItemInLinkedListEnd(linkedList, 12)
    insertItemInLinkedListEnd(linkedList, 13)

    println("LinkedList: $linkedList")
    println("Reverse: ${reverseLinkedList_02(linkedList)}" )

}

fun insertItemInLinkedListEnd(head: LinkedList, data: Int) {
    if (head.next == null) {
        head.next = LinkedList(data, null)
    } else {
        insertItemInLinkedListEnd(head.next!!, data)
    }
}

fun reverseLinkedList(linkedList: LinkedList): LinkedList? {
    if (linkedList.next == null) return linkedList

    var next: LinkedList? = null
    var prv: LinkedList? = null
    var current = linkedList

    while (current.next != null) {
        next = current.next!!
        current.next = prv
        prv = current
        current = next
    }

    return prv

}

fun reverseLinkedList_02(linkedList: LinkedList?): LinkedList? {
    if (linkedList?.next == null) return linkedList
    val newHead = reverseLinkedList_02(linkedList.next)
    linkedList.next?.next = linkedList
    linkedList.next = null
    return newHead
}

data class LinkedList(var data: Int, var next: LinkedList? = null)