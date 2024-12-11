package mate.academy

const val ONE = 10
const val TWO = 20
const val THREE = 30
const val FOUR = 40
const val FIVE = 50
//fun ArrayList<Int>.getSizeMessage() : String = "The list contains + ${this.size} + elements."
fun <E> ArrayList<E>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}

fun main() {
    val list : ArrayList<Int> = arrayListOf<Int>(ONE, TWO, THREE, FOUR, FIVE)
    println(list.getSizeMessage())
}
