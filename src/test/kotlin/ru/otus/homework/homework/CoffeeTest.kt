package ru.otus.homework.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CoffeeDecoratorTest {

    @Test
    fun `test simple coffee`() {
        val coffee = SimpleCoffee()
        assertEquals(200, coffee.cost())
        assertEquals("Простой кофе", coffee.description())
    }

    @Test
    fun `test coffee with milk`() {
        val coffee = MilkDecorator(SimpleCoffee())
        assertEquals(250, coffee.cost())
        assertEquals("Простой кофе, молоко", coffee.description())
    }

    @Test
    fun `test coffee with milk and sugar`() {
        val coffee = SugarDecorator(MilkDecorator(SimpleCoffee()))
        assertEquals(270, coffee.cost())
        assertEquals("Простой кофе, молоко, сахар", coffee.description())
    }

    @Test
    fun `test coffee with sugar and milk`() {
        val coffee = MilkDecorator(SugarDecorator(SimpleCoffee()))
        assertEquals(270, coffee.cost())
        assertEquals("Простой кофе, сахар, молоко", coffee.description())
    }

    @Test
    fun `test coffee with all ingredients`() {
        val coffee = VanillaDecorator(SugarDecorator(MilkDecorator(SimpleCoffee())))
        assertEquals(340, coffee.cost())
        assertEquals("Простой кофе, молоко, сахар, ваниль", coffee.description())
    }
}
