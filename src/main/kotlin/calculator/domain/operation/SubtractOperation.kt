package calculator.domain.operation

class SubtractOperation : AbstractOperation{
    override fun operation(operand1: Int, operand2: Int): Int = operand1 - operand2
}