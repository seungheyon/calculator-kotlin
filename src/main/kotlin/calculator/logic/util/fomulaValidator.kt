package calculator.logic.util

import calculator.logic.constants.OperatorEnum

/**
 * Verify that the argument is a valid operator.
 * Throw IllegalArgumentException with the message "invalid operator: symbol" if it is not the symbol "+", "-", "*", "/%".*/
fun String.validateIsOperator() = run {
    val operatorSymbols = OperatorEnum.Operator.values().map { it.symbol }
    if(this !in operatorSymbols){
        throw IllegalArgumentException("invalid operator : $this")
    }
}

/**
 * Verify that the argument is a valid operand.
 * Throw NumberFormatException if it is not an integer string. */
fun String.validateIsOperand()  = run {
    this.toInt()
}
