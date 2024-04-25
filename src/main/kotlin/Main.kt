import calculator.controller.CalculatorController
import calculator.logic.calculator.PostfixCalculator
import calculator.logic.util.*

fun main(args: Array<String>) {
    //println("Hello World!")
    val postfixExpressionGenerator = PostfixExpressionGenerator()
    val postfixCalculatorService = PostfixCalculator()

    val calculatorController = CalculatorController(
        inputUtil, outputUtil, postfixExpressionGenerator, postfixCalculatorService
    )
    calculatorController.start()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}