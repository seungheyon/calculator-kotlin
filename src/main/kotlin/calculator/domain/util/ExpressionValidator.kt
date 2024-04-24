package calculator.domain.util

import calculator.domain.Operand
import calculator.domain.Operator
import calculator.domain.service.SimpleCalculatorService
import java.util.*

class ExpressionValidator {
    fun validateExpress(expressQueue: Queue<String>): SimpleCalculatorService {
        val operand1 = Operand(expressQueue.remove())
        val operator = Operator(expressQueue.remove())
        val operand2 = Operand(expressQueue.remove())
        return SimpleCalculatorService(operator.symbol, operand1.operand, operand2.operand, OperationFactory())
    }
}