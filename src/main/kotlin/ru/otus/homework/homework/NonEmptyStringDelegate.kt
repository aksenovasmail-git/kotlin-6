package ru.otus.homework.homework

import kotlin.reflect.KProperty

/**
 * Delegate that allows to set non-empty string value
 */
class NonEmptyStringDelegate() {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        TODO("Implement `getValue` function")
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        TODO("Implement `setValue` function")
    }
}