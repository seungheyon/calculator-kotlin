package calculator.logic.util

@Deprecated("PostfixCalculator 전에 구현한 수식 변환 클래스로 현재는 사용하지 않음")
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
