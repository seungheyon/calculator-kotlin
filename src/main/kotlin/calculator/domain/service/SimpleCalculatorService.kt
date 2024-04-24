package calculator.domain.service

import calculator.domain.Operand
import calculator.domain.Operator
import calculator.domain.util.OperationFactory

class SimpleCalculatorService(val operationFactory: OperationFactory) : CalculatorService{

    override fun calculate(expression : List<String>) : Int {
        val operand1 = Operand(expression[0]).getOperand()
        val operand2 = Operand(expression[2]).getOperand()
        val operation = operationFactory.createOperation(Operator(expression[1]).getOperator())
        return operation.operation(operand1, operand2)
    }
}