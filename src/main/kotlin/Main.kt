import calculator.controller.CalculatorController
import calculator.domain.util.*

fun main(args: Array<String>) {
    //println("Hello World!")
    val inputUtil = KeyInput()
    val outputUtil = ConsoleOutput()
    val expressionGenerator = ExpressionGenerator()
    val expressionValidator = ExpressionValidator()

    val calculatorController = CalculatorController(
        inputUtil, outputUtil, expressionGenerator, expressionValidator
    )
    calculatorController.start()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}