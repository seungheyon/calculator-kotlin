package calculator.domain.util

import calculator.domain.operation.*

class OperationFactory {
    fun createOperation(operator : String) : AbstractOperation {
        return when(operator){
            "+" -> AddOperation()
            "-" -> SubtractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            "%" -> ModOperation()
            else -> throw IllegalArgumentException()
        }
    }
}