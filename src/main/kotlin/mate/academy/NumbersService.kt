package mate.academy

fun <T : Any?> ArrayList<T>.getSizeMessage(): String{
    return "The list contains ${this.size} elements."
}
