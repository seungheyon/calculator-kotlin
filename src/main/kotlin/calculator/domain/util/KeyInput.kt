package calculator.domain.util

class KeyInput : InputUtil {
    override fun getInput(): String {
        return readLine().toString()
    }
}