package calculator.domain.util

import calculator.domain.Operand
import calculator.domain.Operator
import calculator.domain.operation.AbstractOperation
import java.util.LinkedList
import java.util.Stack

class PostfixExpressionGenerator(private val operationFactory: OperationFactory) : ExpressionGenerator {

    override fun generateExpression(inputString : String) : List<String> {
        val splitString = inputString.split(" ")
        var operatorStack : Stack<AbstractOperation> = Stack<AbstractOperation>()
        var postfixExpression : MutableList<String> = LinkedList<String>()

        for (term in splitString){
            try{
                 // 피연산자에 대한 검증 진행
                postfixExpression.add(Operand(term).getOperandString())
            }
            catch(e : NumberFormatException){
                val operation = operationFactory.createOperation(Operator(term).getOperator()) // 연산자에 대한 검증 진행
                if(operatorStack.empty()||operatorStack.peek().priority < operation.priority){
                    operatorStack.push(operation)
                    continue
                }
                while(!operatorStack.empty()&&operatorStack.peek().priority >= operation.priority){
                    postfixExpression.add(operatorStack.pop().convertToString())
                }
                operatorStack.push(operation)
            }
        }
        while(!operatorStack.empty()){
            postfixExpression.add(operatorStack.pop().convertToString())
        }
        return postfixExpression
    }
}