package calculator.domain.util

class ConsoleOutput : OutputUtil {
    override fun printline(message : Int) {
        println(message)
    }
    override fun printline(message : String) {
        println(message)
    }
}