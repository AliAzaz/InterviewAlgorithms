fun main() {
    val root = Node(4, Node(2, Node(0), Node(1)), Node(7))
    val result = addItemInTree(root, 6)
    println(result)
}

fun itemExitInTree(node: Node, item: Int): Boolean {
    if (item == node.item) return true
    return if (item > node.item && node.right != null) {
        itemExitInTree(node.right!!, item)
    } else if (item < node.item && node.left != null) {
        itemExitInTree(node.left!!, item)
    } else false
}

fun getNodeOfExistItem(node: Node, item: Int): Node {
    if (item == node.item) return node
    return if (item > node.item && node.right != null) {
        getNodeOfExistItem(node.right!!, item)
    } else if (item < node.item && node.left != null) {
        getNodeOfExistItem(node.left!!, item)
    } else node
}

fun addItemInTree(node: Node, item: Int): Node {
    return if (item > node.item) {
        if (node.right == null) {
            node.right = Node(item)
            node
        } else addItemInTree(node.right!!, item)
    } else {
        if (node.left == null) {
            node.left = Node(item)
            node
        } else addItemInTree(node.left!!, item)
    }
}

data class Node(var item: Int, var left: Node? = null, var right: Node? = null)