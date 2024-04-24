package calculator.controller

import calculator.domain.service.CalculatorService
import calculator.domain.service.SimpleCalculatorService
import calculator.domain.util.*

class CalculatorController(
    private val inputUtil : InputUtil,
    private val outputUtil: OutputUtil,
    private val expressionGenerator: ExpressionGenerator,
    //private val expressionValidator: ExpressionValidator,
    private val calculatorService: CalculatorService
    ) {

    fun start(){
        while(true){
            try{
                outputUtil.printline("Please enter the operator and operand separated by spaces.")
                val expression = expressionGenerator.generateExpression(inputUtil.getInput())
                //val calculateService : SimpleCalculatorService = expressionValidator.validateExpress(expression)
                val result = calculatorService.calculate(expression)
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