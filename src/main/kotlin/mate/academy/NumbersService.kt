package mate.academy

//fun ArrayList<Int>.getSizeMessage() : String = "The list contains + ${this.size} + elements."
fun <E> ArrayList<E>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}

fun main() {
    val list : ArrayList<Int> = arrayListOf<Int>(10, 20, 30, 40, 50)
    println(list.getSizeMessage())
}
