package mate.academy

private const val MESSAGE = "The list contains %s elements."
fun <T> ArrayList<T>.getSizeMessage(): String {
    return MESSAGE.format(this.size)
}
