package ru.otus.homework.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LoggingUserProfileTest {

    @Test
    fun `valid fullName and email should be accepted`() {
        val user = UserProfile.createWithLogging("Valid Name", "valid@example.com")
        user.fullName = "Alice Smith"
        user.email = "alice@example.com"

        assertEquals("Alice Smith", user.fullName)
        assertEquals("alice@example.com", user.email)
    }

    @Test
    fun `invalid fullName should be rejected`() {
        val user = UserProfile.createWithLogging("Valid Name", "valid@example.com")
        user.fullName = ""

        assertEquals("Valid Name", user.fullName, "Empty fullName should be rejected")
    }

    @Test
    fun `invalid email should be rejected`() {
        val user = UserProfile.createWithLogging("Valid Name", "valid@example.com")
        user.email = "invalidEmail"

        assertEquals("valid@example.com", user.email, "Invalid email should be rejected")
    }

    @Test
    fun `logs name change`() {
        val user = UserProfile.createWithLogging("Valid Name", "valid@example.com")
        user.fullName = "Alice Smith"
        assertEquals(
            listOf("Changing `fullName` from 'Valid Name' to 'Alice Smith'"),
            user.getLog()
        )
    }

    @Test
    fun `logs email change`() {
        val user = UserProfile.createWithLogging("Valid Name", "valid@example.com")
        user.email = "alice@example.com"
        assertEquals(
            listOf("Changing `email` from 'valid@example.com' to 'alice@example.com'"),
            user.getLog()
        )
    }
}
