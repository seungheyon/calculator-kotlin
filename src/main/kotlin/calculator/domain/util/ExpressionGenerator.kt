package calculator.domain.util

import java.util.LinkedList
import java.util.Queue

class ExpressionGenerator {

    fun separateString(operation: String): Queue<String> {
        val stringList = operation.split(" ")

        val restrictedQueueSize = 3;
        if(stringList.size>restrictedQueueSize){
            throw IllegalStateException()
        }
        var expressionQueue : Queue<String> = LinkedList<String>()
        for(item in stringList){
            if(!expressionQueue.offer(item)){
                throw IllegalStateException()
            }
        }
        return expressionQueue
    }

}