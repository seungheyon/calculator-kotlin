package calculator.logic.util

import calculator.logic.constants.OperatorEnum

fun String.validateIsOperator() = run {
    val operatorSymbols = OperatorEnum.Operator.values().map { it.symbol }
    if(this !in operatorSymbols){
        throw IllegalArgumentException("invalid operator : $this")
    }
}

fun String.validateIsOperand()  = run {
    this.toInt()
}
