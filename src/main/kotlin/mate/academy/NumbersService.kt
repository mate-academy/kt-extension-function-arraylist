package mate.academy

fun ArrayList<*>.getSizeMessage(): String {
    val size = this.size
    return "The list contains $size elements."
}
