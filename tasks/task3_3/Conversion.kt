// Task 3.3: conversion of strings to numbers
fun main() {
    print("Enter an integer: ")
    val intInput = readLine()
    val intVal = intInput?.toIntOrNull()
    println("Converted integer: $intVal")

    print("Enter a double: ")
    val doubleInput = readLine()
    val doubleVal = doubleInput?.toDoubleOrNull()
    println("Converted double: $doubleVal")
}