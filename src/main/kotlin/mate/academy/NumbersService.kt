package mate.academy

fun <T> ArrayList<T>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}

fun main() {
    val list : ArrayList<Int> = arrayListOf<Int>(10, 20, 30, 40, 50)
    println(list.getSizeMessage())
}
