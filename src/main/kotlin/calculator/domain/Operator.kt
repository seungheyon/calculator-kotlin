package calculator.domain

class Operator(symbol : String) {
    val symbol : String

    init {
        this.symbol = validateCalculatorSymbol(symbol)
    }

    private fun validateCalculatorSymbol(symbol: String) : String{
        return when(symbol){
            "+" -> "+"
            "-" -> "-"
            "*" -> "*"
            "/" -> "/"
            "%" -> "%"
            else -> throw IllegalStateException()
        }
    }
}