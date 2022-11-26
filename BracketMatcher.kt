/*
* Identity weather statement is fulfilling opening and closing brackets or not like when bracket is opening
* then it also has to close otherwise statement is false.
* */

fun main() {
    println(bracketMatcher("(coder)(byte)()"))
}

fun bracketMatcher(statement: String): Boolean {
    var flag = true
    var count = 0
    statement.forEach {
        if (it == '(') count++
        else if (it == ')')
            if (count > 0) count--
            else {
                flag = false
                return@forEach
            }
    }
    return flag
}