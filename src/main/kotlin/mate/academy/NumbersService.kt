package mate.academy

object NumbersService {
    fun <T> ArrayList<T>.getSizeMessage(): String {
        return "The list contains ${this.size} elements."
    }
}
