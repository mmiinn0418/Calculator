import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // 사용자로부터 숫자와 연산자 입력 받기
    print("첫 번째 숫자를 입력하세요: ")
    val num1 = scanner.nextDouble()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = scanner.nextDouble()

    print("연산자를 입력하세요 (+, -, *, /): ")
    val operator = scanner.next()

    // 입력 받은 연산자에 따라 계산 수행
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "나눗셈은 0으로 나눌 수 없습니다."
        else -> "올바른 연산자를 입력하세요."
    }

    // 결과 출력
    println("결과: $result")
}
