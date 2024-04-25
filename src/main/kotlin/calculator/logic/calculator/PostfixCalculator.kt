package calculator.logic.calculator

import calculator.logic.util.convertOperation
import java.util.*

class PostfixCalculator() : Calculator {
    override fun calculate(expression: List<String>): Int {
        var operandStack = Stack<Int>()

        for (term in expression) {
            try {
                operandStack.push(term.toInt())
            } catch (e: NumberFormatException) {
                val operator = term.convertOperation()
                val operand2 = operandStack.pop()
                val operand1 = operandStack.pop()
                operandStack.push(operator.operation(operand1, operand2))
            }
        }
        return operandStack.pop()
    }
}
