package calculator.logic.operation

class SubtractOperation : AbstractOperation{
    override val priority = 10
    override fun operation(operand1: Int, operand2: Int): Int = operand1 - operand2
    override fun convertToString() : String = "-"
}
