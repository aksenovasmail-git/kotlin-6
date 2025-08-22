package ru.otus.homework.homework

/**
 * Базовый интерфейс кофейного напитка
 */
interface Coffee {
    /**
     * Цена кофейного напитка в копейках
     */
    fun cost(): Int

    /**
     * Описание кофейного напитка
     */
    fun description(): String
}

class SimpleCoffee : Coffee {
    override fun cost() = 200
    override fun description() = "Простой кофе"
}

class MilkDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Int {
        TODO("Not yet implemented")
    }

    override fun description(): String {
        TODO("Not yet implemented")
    }
}

class SugarDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Int {
        TODO("Not yet implemented")
    }

    override fun description(): String {
        TODO("Not yet implemented")
    }
}

class VanillaDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Int {
        TODO("Not yet implemented")
    }

    override fun description(): String {
        TODO("Not yet implemented")
    }
}