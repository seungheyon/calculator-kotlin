package calculator.domain.operation

interface AbstractOperation {
    val priority : Int
    fun operation(operand1 : Int, operand2 : Int) : Int
    fun convertToString() : String
}