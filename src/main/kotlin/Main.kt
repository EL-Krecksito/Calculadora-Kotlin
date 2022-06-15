package CalculatorTerminal
import kotlin.*

fun main() {
    // Insert a number
    print("Enter a first number: ")
    val Number1 = readLine()?.toFloat()
    print("Enter a second number: ")
    val Number2 = readLine()?.toFloat()

    println("") // A space

    // Print the operations
    println("To add: +")
    println("To subtract: -")
    println("To multiply: *")
    println("To split: /")

    // Set the operation
    println("") // Other space
    print("Enter the operation: ")
    val Operation = readLine()?.toString()

    // If the operation is a add
    when (Operation) {
        "+" -> {
            val Add = Number2?.let { Number1?.plus(it) }
            println("The output is: $Add")
        }

        // If the operation is a subtraction
        "-" -> {
            val Substract = Number2?.let { Number1?.minus(it) }
            println("The output is: $Substract")
        }

        // If the operation is a multiply
        "*" -> {
            val Multiply = Number2?.let { Number1?.times(it) }
            println("The output is: $Multiply")
        }

        // If the operation is a split
        "/" -> {
            val Split = Number2?.let { Number1?.div(it) }
            println("The split is: $Split")
            val Residue: Float? = Number2?.let { Number1?.rem(it) }
            println("The residue is: $Residue")
        }
    }
}