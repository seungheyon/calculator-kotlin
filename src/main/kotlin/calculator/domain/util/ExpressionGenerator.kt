package calculator.domain.util

interface ExpressionGenerator {
    fun generateExpression(inputString : String) : List<String>
}