/*
* Finding triplets equals to zero.
* Print those triplets and also print no of times it is printing.
*
* Note: This question was asked in agoda interview
* */

fun main() {
    val result = findingTriplets(arrayOf(0, -1, 5, 10, -7, -3, 4, 1))
    println(result)
}

fun findingTriplets(item: Array<Int>): Int {

    val list = arrayListOf<Array<Int>>()
    var count = 0
    for (i in item.indices) {
        for (j in i + 1 until item.size) {
            for (k in j + 1 until item.size) {
                if (item[i] + item[j] + item[k] == 0) {
                    val found = arrayOf(item[i], item[j], item[k])
                    list.add(found)
                    count += 1
                    break
                }
            }
        }
    }

    list.forEach {
        println(it.joinToString(","))
    }
    return count
}