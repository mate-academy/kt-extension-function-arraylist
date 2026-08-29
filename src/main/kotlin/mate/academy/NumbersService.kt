package mate.academy

const val TEN = 10
const val TWENTY = 20
const val THIRTY = 30
const val FORTY = 40
const val FIFTY = 50

fun <T> ArrayList<T>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}

fun main() {
    val list: ArrayList<Int> = arrayListOf (TEN, TWENTY, THIRTY, FORTY, FIFTY)
    println(list.getSizeMessage())
}
