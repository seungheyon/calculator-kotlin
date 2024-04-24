코틀린 프로그래밍 계산기 과제입니다. 

코드를 최대한 객체지향적으로 짜려고 노력했습니다. 

처음엔 입력 문자열로부터 피연산자, 연산자, 피연산자의 3개의 항만을 추출하여 단일 연산을 수행하는 계산기로 구현하였고, 
이후 확장성을 고려하여 입력으로부터 연산자와 피연산자를 분리하여 한 번의 입력에서 여러 연산을 수행할 수 있는 기능을 추가하였습니다.

입력된 수식을 문자열 리스트로 나타내는 expressionGenerator 인터페이스와 연산을 수행하는 CalculatorService 인터페이스의 구현체 클래스를 따로 작성하여 
두 가지 계산기에 대해 확장에 유연하도록 설계했습니다.

1. Simple Infix Calculator
	간단한 중위연산 계산기입니다. SimpleInfixExpression 구현체는 입력 문자열로부터 3개의 항을 분리하여 expression (List<String>)을 
	반환하고, 컨트롤러에서는 CalculatorService 의 구현체 중 하나인 SimpleCalculatorService 의 calculate() 메서드를 통해 연산을 수행합니다.

3. Postfix Calculator
	후위표현식과 스택을 이용한 계산기입니다. PostfixExpressionGenerator 구현체가 입력 문자열로부터 피연산자와 연산자를 구분하고 검증하며 
	후위 표현식 알고리즘에 따라 expression  (List<String>) 을 반환하고 컨트롤러에서는 CalculatorService 인터페이스의 구현체 중 하나인
	PostfixCalculatorService 의 calculate() 메서드를 통해 연산을 수행합니다. 
   
