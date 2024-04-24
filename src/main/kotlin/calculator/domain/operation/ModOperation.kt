package calculator.domain.operation

class ModOperation : AbstractOperation{
    override val priority = 12
    override fun operation(operand1: Int, operand2: Int): Int  {
        if (operand2 == 0) {
            throw IllegalArgumentException("It cannot be divided by zero")
        }
        return operand1 % operand2
    }
    override fun convertToString() : String = "%"
}