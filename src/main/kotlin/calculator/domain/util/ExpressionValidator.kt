package calculator.domain.util

import calculator.domain.Operand
import calculator.domain.Operator
import calculator.domain.operation.OperationFactory
import calculator.domain.service.CalculateService
import java.util.*

class ExpressionValidator {
    fun validateExpress(expressQueue: Queue<String>): CalculateService {
        val operand1 = Operand(expressQueue.remove())
        val operator = Operator(expressQueue.remove())
        val operand2 = Operand(expressQueue.remove())
        return CalculateService(operator.symbol, operand1.operand, operand2.operand, OperationFactory())
    }
}