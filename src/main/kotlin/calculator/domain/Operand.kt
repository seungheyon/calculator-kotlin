package calculator.domain

class Operand(operandString: String) {
    private val operandValue : Int

    init {
        this.operandValue = validateOperandIsInt(operandString)
    }

    private fun validateOperandIsInt(operandString: String) : Int {
        return operandString.toInt()
    }

    fun getOperand() : Int{
        return operandValue
    }

    fun getOperandString() : String = operandValue.toString()

}