package calculator.logic.util

import calculator.logic.constants.OperatorEnum
import calculator.logic.operation.*

/**
 * Returns the operator object according to the string entered as an argument.
 * Throw IllegalArgumentException with the message "invalid operator: symbol" if it is not the symbol "+", "-", "*", "/%".*/
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
