package calculator.domain.operation

class MultiplyOperation : AbstractOperation {
    override val priority = 12
    override fun operation(operand1: Int, operand2: Int): Int = operand1 * operand2
    override fun convertToString() : String = "*"
}