package calculator.domain.service

class CalculateService(operator : String, operand1 : Int, operand2 : Int) {
    private val operator : String
    private val operand1 : Int
    private val operand2 : Int

    init {
        this.operator = operator
        this.operand1 = operand1
        this.operand2 = operand2
    }

    fun calculate() : Int {
        return when(operator){
            "+" -> operand1 + operand2
            "-" -> operand1 - operand2
            "*" -> operand1 * operand2
            "/" -> operand1 / operand2
            "%" -> operand1 % operand2
            else -> return 0
        }
    }
}