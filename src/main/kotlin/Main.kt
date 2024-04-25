import calculator.controller.CalculatorController
import calculator.logic.calculator.PostfixCalculator
import calculator.logic.util.*

fun main(args: Array<String>) {
    //println("Hello World!")
    val postfixExpressionGenerator = PostfixExpressionGenerator()
    val postfixCalculatorService = PostfixCalculator()

    val calculatorController = CalculatorController(
        expressionGenerator = postfixExpressionGenerator,
        calculatorService = postfixCalculatorService
    )
    calculatorController.start()
}
