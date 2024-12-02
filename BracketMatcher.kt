/*
* Identity weather statement is fulfilling opening and closing brackets or not like when bracket is opening
* then it also has to close otherwise statement is false.
* */

fun main() {
    println(bracketMatcher02("(coder)(byte)()"))
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

fun bracketMatcher02(statement: String): Boolean {
    val stack = ArrayDeque<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    statement.forEach {
        when {
            it == '(' || it == '{' || it == '[' -> stack.addLast(it) // Push opening brackets
            it == ')' || it == '}' || it == ']' -> {
                if (stack.isEmpty() || stack.removeLast() != matchingBrackets[it]) {
                    return false // Unmatched closing bracket or stack underflow
                }
            }
        }
    }

    return stack.isEmpty() // If stack is empty, brackets are balanced
}