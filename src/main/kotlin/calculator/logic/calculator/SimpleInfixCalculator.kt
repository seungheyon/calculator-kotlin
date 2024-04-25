package calculator.logic.calculator

import calculator.logic.util.convertOperation
import calculator.logic.util.validateIsOperand


@Deprecated("PostfixCalculator 전에 구현한 계산기 클래스로 현재는 사용하지 않음")
class SimpleCalculator() : Calculator{

    override fun calculate(expression : List<String>) : Int {
        expression[2].validateIsOperand()
        val operand1 = expression[0].toInt()
        val operand2 = expression[2].toInt()
        val operation = expression[1].convertOperation()
        return operation.operation(operand1, operand2)
    }
}
