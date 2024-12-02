import java.util.Random

fun main() {
    val array = ArrayDeque<String>()
    var i = 1
    while ( i < 100){
        array.add(Random().nextInt(i).toString())
        i++
    }
    println(array)
}

