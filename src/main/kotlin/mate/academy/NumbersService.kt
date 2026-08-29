package mate.academy

// provide your solution below
private const val FIRST_VALUE = 10
private const val SECOND_VALUE = 20
private const val THIRD_VALUE = 30
private const val FOURTH_VALUE = 40
private const val FIFTH_VALUE = 50

fun <T> ArrayList<T>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}

fun main() {
    val list: ArrayList<Int> = arrayListOf(
        FIRST_VALUE, SECOND_VALUE, THIRD_VALUE, FOURTH_VALUE, FIFTH_VALUE)
    println(list.getSizeMessage())
}
