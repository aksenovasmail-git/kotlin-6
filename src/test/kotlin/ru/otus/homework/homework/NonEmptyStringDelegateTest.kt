package ru.otus.homework.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NonEmptyStringDelegateTest {
    class TestClass {
        var name: String by NonEmptyStringDelegate()
    }

    @Test
    fun `should accept non-empty string`() {
        val test = TestClass()
        test.name = "Kotlin"
        assertEquals("Kotlin", test.name)
    }

    @Test
    fun `should reject empty string`() {
        val test = TestClass()
        test.name = "Initial"
        test.name = ""
        assertEquals("Initial", test.name, "Empty string should not overwrite the value")
    }

    @Test
    fun `should reject blank string`() {
        val test = TestClass()
        test.name = "Initial"
        test.name = "   "
        assertEquals("Initial", test.name, "Blank string should not overwrite the value")
    }

    @Test
    fun `should initialize with default value`() {
        val test = TestClass()
        assertEquals("", test.name)
    }
}
