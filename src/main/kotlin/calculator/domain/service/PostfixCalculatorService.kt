package calculator.domain.service

import calculator.domain.util.OperationFactory
import java.util.*

class PostfixCalculatorService(private val operationFactory: OperationFactory) : CalculatorService{
    override fun calculate(expression : List<String>) : Int {
        var operandStack = Stack<Int>()

        for(term in expression){
            try{
                operandStack.push(term.toInt())
            }
            catch (e : NumberFormatException){
                val operator = operationFactory.createOperation(term)
                val operand2 = operandStack.pop()
                val operand1 = operandStack.pop()
                operandStack.push(operator.operation(operand1, operand2))
            }
        }
        return operandStack.pop()
    }
}