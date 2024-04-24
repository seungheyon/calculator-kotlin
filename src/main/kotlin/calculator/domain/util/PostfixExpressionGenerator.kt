package calculator.domain.util

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
                term.toInt()
                postfixExpression.add(term)
            }
            catch(e : NumberFormatException){
                val operation = operationFactory.createOperation(term)
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