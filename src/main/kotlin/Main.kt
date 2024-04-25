import calculator.controller.CalculatorController
import calculator.logic.calculator.PostfixCalculator
import calculator.logic.util.*

fun main(args: Array<String>) {
    //println("Hello World!")
    val postfixExpressionGenerator = PostfixExpressionGenerator()
    val postfixCalculator = PostfixCalculator()

    val calculatorController = CalculatorController(
        expressionGenerator = postfixExpressionGenerator,
        calculator = postfixCalculator
    )
    calculatorController.start()
}
