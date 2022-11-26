//How do you design a solution for a given natural number convert it to a letter
/*
* Copied from somewhere
* */

fun main() {
    println(convertNaturalNoToWords(7700))
}

fun convertNaturalNoToWords(no: Int): String {
    if (no < 20) return arraySingle[no]
    val item = no.toString()
    var result = ""

    for (i in item.length downTo 1) {
        if (i == 1) {
            val single = arraySingle[item[item.length - 1].digitToInt()]
            result += " $single"
        } else if (i == 2) {
            val double = arrayDouble[item[item.length - i].digitToInt()]
            result += " $double"
        } else {
            val single = arraySingle[item[item.length - i].digitToInt()]
            result += " $single"
            val double = arrayMultiple[item.length - i + 1]
            result += " $double"
        }
    }

    return result


}

val arraySingle = arrayOf(
    "", "One", "Two", "Three",
    "Four", "Five", "Six", "Seven",
    "Eight", "Nine", "Ten", "Eleven",
    "Twelve", "Thirteen", "Fourteen", "Fifteen",
    "Sixteen", "Seventeen", "Eighteen", "Nineteen"
)

val arrayDouble = arrayOf(
     "Twenty", "Thirty",
    "Forty", "Fifty", "Sixty",
    "Seventy", "Eighty", "Ninety"
)

val arrayMultiple = arrayOf(
     "","","Hundred", "Thousand", "Million", "Billion", "Trillion"
)
