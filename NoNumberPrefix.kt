//No number in the list is the prefix of another number in the list
/*
* Number: 9876543 exist as the prefix in the list
* */

fun main() {
    val list = arrayListOf<Long>(
        911,
        9876543,
        9122345,
        9896543,
        9102345,
        9876573,
        9212345,
        9876563,
        9312345,
        9776543,
        9612348,
        987543,
        112345,
        9876643,
        992345,
        9076543,
        9612345,
        9876543321,
        912345
    )

    print(noNumberPrefix(list))
}

fun noNumberPrefix(list: ArrayList<Long>): Boolean {
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            var first = list[i].toString()
            var second = list[j].toString()
            if (list[i].toString().length < list[j].toString().length) {
                first = list[j].toString()
                second = list[i].toString()
            }
            if (first.substring(0, second.length) == second) return false
        }
    }
    return true
}