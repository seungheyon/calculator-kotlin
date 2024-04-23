package calculator.domain

class Operand(operandString: String) {
    val operand : Int

    init {
        this.operand = validateOperandIsInt(operandString)
    }

    private fun validateOperandIsInt(operandString: String) : Int {
        return operandString.toInt()
    }

}