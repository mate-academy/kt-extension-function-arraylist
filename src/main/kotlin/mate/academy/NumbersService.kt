package mate.academy

import java.util.ArrayList

fun <T> ArrayList<T>.getSizeMessage(): String {
    return "The list contains ${this.size} elements."
}
