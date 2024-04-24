package calculator.domain.service

import calculator.domain.util.OperationFactory

class SimpleCalculatorService(operator : String, operand1 : Int, operand2 : Int, operationFactory: OperationFactory){
    private val operator : String
    private val operand1 : Int
    private val operand2 : Int
    private val operationFactory : OperationFactory

    init {
        this.operator = operator
        this.operand1 = operand1
        this.operand2 = operand2
        this.operationFactory = operationFactory
    }

    fun calculate() : Int {
        val operation = operationFactory.createOperation(operator)
        return operation.operation(operand1, operand2)
    }
}