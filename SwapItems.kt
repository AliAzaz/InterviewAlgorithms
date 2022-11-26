/*
* Swap two items without using temp variable
* */

fun main() {
    swapItems(3, 5)
}

fun swapItems(a: Int, b: Int) {
    var item1 = a
    var item2 = b

    item1 += item2
    item2 = item1 - item2
    item1 -= item2

    println("$a -> $item1")
    println("$b -> $item2")
}