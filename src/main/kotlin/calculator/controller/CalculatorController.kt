package calculator.controller

import calculator.logic.calculator.Calculator
import calculator.logic.util.*

class CalculatorController(
    private val expressionGenerator: ExpressionGenerator,
    private val calculatorService: Calculator
) {

    fun start() {
        while (true) {
            try {
                println("Please enter the operator and operand separated by spaces.")
                val expression = expressionGenerator.generateExpression(readLine().toString())
                val result = calculatorService.calculate(expression)
                println(result)
                break
            } catch (e: IllegalArgumentException) {
                println(e.message)
            } catch (e: IllegalStateException) {
                println("Please enter one formula for one input")
            } catch (e: NumberFormatException) {
                println("Please enter a valid number")
            }
        }
    }
}
