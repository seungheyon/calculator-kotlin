package calculator.domain.util

import calculator.domain.Operand
import calculator.domain.Operator

class SimpleInfixExpressionGenerator : ExpressionGenerator {


     override fun generateExpression(inputString: String): List<String> {
        val stringList = inputString.split(" ")
        val restrictedQueueSize = 3;
        if(stringList.size>restrictedQueueSize){
            throw IllegalStateException("Please enter one formula for one input")
        }
        return stringList
    }
}