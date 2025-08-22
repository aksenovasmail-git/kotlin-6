package ru.otus.homework.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserProfileTest {

    @Test
    fun `valid fullName and email should be accepted`() {
        val user = UserProfile.create("Valid Name", "valid@example.com")
        user.fullName = "Alice Smith"
        user.email = "alice@example.com"

        assertEquals("Alice Smith", user.fullName)
        assertEquals("alice@example.com", user.email)
    }

    @Test
    fun `invalid fullName should be rejected`() {
        val user = UserProfile.create("Valid Name", "valid@example.com")
        user.fullName = ""

        assertEquals("Valid Name", user.fullName, "Empty fullName should be rejected")
    }

    @Test
    fun `invalid email should be rejected`() {
        val user = UserProfile.create("Valid Name", "valid@example.com")
        user.email = "invalidEmail"

        assertEquals("valid@example.com", user.email, "Invalid email should be rejected")
    }
}
