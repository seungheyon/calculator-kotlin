package calculator.domain.service

interface CalculatorService {
    fun calculate(expression : List<String>) : Int
}