package calculator.controller

import calculator.domain.service.CalculateService
import calculator.domain.util.ExpressionValidator
import calculator.domain.util.ExpressionGenerator
import calculator.domain.util.InputUtil
import calculator.domain.util.OutputUtil

class CalculatorController(
    private val inputUtil : InputUtil,
    private val outputUtil: OutputUtil,
    private val expressionGenerator: ExpressionGenerator,
    private val expressionValidator: ExpressionValidator
    ) {

    fun start(){
        while(true){
            try{
                outputUtil.printline("Please enter the operator and operand separated by spaces.")
                val expressionQueue = expressionGenerator.separateString(inputUtil.getInput())
                val calculateService : CalculateService = expressionValidator.validateExpress(expressionQueue)
                val result = calculateService.calculate()
                outputUtil.printline(result)
                break
            }
            catch (e : IllegalArgumentException){
                println("Please enter a valid formula")
            }
            catch (e : IllegalStateException){
                println("Please enter one formula for one input")
            }
            catch (e : NumberFormatException){
                println("Please enter a valid number")
            }
        }



    }

}