package calculator.logic.util

import calculator.logic.constants.OperatorEnum
import calculator.logic.operation.*

fun String.convertOperation() = run {
    when (this) {
        OperatorEnum.Operator.ADDITION.symbol -> AddOperation()
        OperatorEnum.Operator.SUBTRACTION.symbol -> SubtractOperation()
        OperatorEnum.Operator.MULTIPLICATION.symbol -> MultiplyOperation()
        OperatorEnum.Operator.DIVISION.symbol -> DivideOperation()
        OperatorEnum.Operator.MODULO.symbol -> ModOperation()
        else -> throw IllegalArgumentException("invalid operator : $this")
    }
}
