package mate.academy

import mate.academy.NumbersService.getSizeMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class NumbersServiceTest {
    @Test
    fun `test sizeMessage with multiple elements`() {
        val list = ArrayList<String>().apply {
            add("apple")
            add("banana")
            add("cherry")
        }
        assertEquals("The list contains 3 elements.", list.getSizeMessage())
    }

    @Test
    fun `test sizeMessage with no elements`() {
        val list = ArrayList<String>()
        assertEquals("The list contains 0 elements.", list.getSizeMessage())
    }

    @Test
    fun `test sizeMessage with one element`() {
        val list = ArrayList<String>().apply {
            add("apple")
        }
        assertEquals("The list contains 1 elements.", list.getSizeMessage())
    }
}
