package intersection//Find intersection in between array items

fun main() {
    println(findIntersection02(arrayOf("1, 3, 9, 10, 17, 18", "1, 4, 9, 9, 10")))
}

fun findIntersection(strArr: Array<String>) {
    val first = strArr[0].split(",").map { it.replace(" ", "").toInt() }
    val second = strArr[1].split(",").map { it.replace(" ", "").toInt() }
    val result = first.filter { second.contains(it) }.map { it }

    println(first)
    println(second)
    println(result)

}
fun findIntersection02(strArr: Array<String>) {
    val first = strArr[0].split(",").map { it.trim().toInt() }
    val second = strArr[1].split(",").map { it.trim().toInt() }
    val result = mutableSetOf<Int>()

    val (smaller, larger) = if (first.size > second.size) second to first else first to second
    for (i in smaller) {
        if (i in larger) {
            result.add(i)
        }
    }

    println(result)
}