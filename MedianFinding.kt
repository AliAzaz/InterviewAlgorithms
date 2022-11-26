/*
* Median finding problem
* */

fun main() {

//    val arrayNumber = arrayOf(6,2,10,49,193,1)
    val arrayNumber = arrayOf(1,2,3)
    medianFinding(arrayNumber)

}

fun medianFinding(array: Array<Int>) {

    val result = arrayListOf(array[0])
    val list = arrayListOf(array[0])
    val sort = arrayListOf(array[0])

    for (i in 1 until array.size) {
        list.add(array[i])
        sort.add(array[i])
        sort.sort()
        var max = list.size - 1
        if (sort.size % 2 == 0) max = list.size - 2
        val index = max / 2
        result.add(sort[index])
    }
    println(result.joinToString())
}