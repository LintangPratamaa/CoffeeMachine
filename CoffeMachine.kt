package com.lintang.coffeemachine

fun main() {
    askCoffe()
}

fun askCoffe() {
    print("Order coffee in whose name? ")
    val name = readlnOrNull()?.trim()?.takeIf { it.isNotEmpty() } ?: run {
        println("Name cannot be empty.")
        return
    }
    print("How many spoons of sugar do you want? ")
    val sugar = readlnOrNull()?.trim()?.toIntOrNull() ?: run {
        println("Invalid input for sugar amount.")
        return
    }
    if (sugar < 0) {
        println("Sugar amount cannot be negative.")
        return
    }

    makeCoffe(sugar, name)
}

fun makeCoffe(sugarCount : Int, name : String) {
    val sugarText = when (sugarCount) {
        0 -> "no sugar"
        1 -> "1 spoon of sugar"
        else -> "$sugarCount spoons of sugar"
    }

    println("The coffe with $sugarText sugar for $name is ready!")
}