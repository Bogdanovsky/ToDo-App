package com.bogdanovsky.todoapp

data class TodoItem(
    val id: String,
    val text: String,
    val priority: Priority,
    val done: Boolean,
    val creationTime: String,
    val deadline: String? = null,
    val modificationDate: String? = null
)


enum class Priority() {
    LOW,
    MEDIUM,
    HIGH
}