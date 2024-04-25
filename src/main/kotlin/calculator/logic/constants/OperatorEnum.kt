package calculator.logic.constants

class OperatorEnum {
    enum class Operator(val symbol: String) {
        ADDITION("+"),
        SUBTRACTION("-"),
        MULTIPLICATION("*"),
        DIVISION("/"),
        MODULO("%");
    }
}
