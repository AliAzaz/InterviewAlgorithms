fun main() {

    val item = arrayListOf<Int>()
    repeat(10) {
        item.add(createFibonacciSeries(it))
    }
    println(item)
}

fun createFibonacciSeries(cycles: Int): Int {
    return when (cycles) {
        0 -> 0
        1 -> 1
        else -> createFibonacciSeries(cycles - 1) + createFibonacciSeries(cycles - 2)
    }
}