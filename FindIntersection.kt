//Find intersection in between array items

fun main() {
    println(findIntersection(arrayOf("1, 3, 9, 10, 17, 18", "1, 4, 9, 9, 10")))
}

fun findIntersection(strArr: Array<String>) {

    val first = strArr[0].split(",").map { it.replace(" ", "").toInt() }
    val second = strArr[1].split(",").map { it.replace(" ", "").toInt() }

    val result = first.filter { second.contains(it) }.map { it }

    println(first)
    println(second)
    println(result)

}