package calculator.logic.util

import calculator.logic.operation.AbstractOperation
import java.util.LinkedList
import java.util.Stack

class PostfixExpressionGenerator() : ExpressionGenerator {

    override fun generateExpression(inputString: String): List<String> {
        val splitString = inputString.split(" ")
        var operatorStack: Stack<AbstractOperation> = Stack<AbstractOperation>()
        var postfixExpression = LinkedList<String>()

        for (term in splitString) {
            try {
                // 피연산자에 대한 검증
                term.validateIsOperand()
                postfixExpression.add(term)
            } catch (e: NumberFormatException) {
                // 연산자에 대한 검증
                term.validateIsOperator()
                val operation = term.convertOperation()
                if (operatorStack.empty() || operatorStack.peek().priority < operation.priority) {
                    operatorStack.push(operation)
                    continue
                }
                while (!operatorStack.empty() && operatorStack.peek().priority >= operation.priority) {
                    postfixExpression.add(operatorStack.pop().convertToString())
                }
                operatorStack.push(operation)
            }
        }
        while (!operatorStack.empty()) {
            postfixExpression.add(operatorStack.pop().convertToString())
        }
        return postfixExpression
    }
}
