package calculator.domain.operation

interface AbstractOperation {
    fun operation(operand1 : Int, operand2 : Int) : Int
}