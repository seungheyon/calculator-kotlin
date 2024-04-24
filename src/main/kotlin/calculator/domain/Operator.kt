package calculator.domain

class Operator(symbol : String) {
    private val operator : String

    init {
        this.operator = validateCalculatorSymbol(symbol)
    }

    private fun validateCalculatorSymbol(symbol: String) : String{
        return when(symbol){
            "+" -> "+"
            "-" -> "-"
            "*" -> "*"
            "/" -> "/"
            "%" -> "%"
            else -> throw IllegalStateException("Please enter a valid operator")
        }
    }

    fun getOperator() : String{
        return operator
    }
}