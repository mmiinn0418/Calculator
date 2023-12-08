import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        try {
            println("간단한 계산기입니다. 다음 중 하나를 선택하세요:")
            println("1. 덧셈")
            println("2. 뺄셈")
            println("3. 곱셈")
            println("4. 나눗셈")
            println("0. 종료")

            print("원하는 연산을 선택하세요: ")
            val choice = scanner.nextInt()

            if (choice == 0) {
                println("계산기를 종료합니다.")
                break
            }

            print("첫 번째 숫자를 입력하세요: ")
            val num1 = scanner.nextDouble()

            print("두 번째 숫자를 입력하세요: ")
            val num2 = scanner.nextDouble()

            when (choice) {
                1 -> println("덧셈 결과: ${num1 + num2}")
                2 -> println("뺄셈 결과: ${num1 - num2}")
                3 -> println("곱셈 결과: ${num1 * num2}")
                4 -> {
                    if (num2 != 0.0) {
                        println("나눗셈 결과: ${num1 / num2}")
                    } else {
                        println("나눗셈은 0으로 나눌 수 없습니다.")
                    }
                }
                else -> println("잘못된 선택입니다. 다시 선택하세요.")
            }
        } catch (e: InputMismatchException) {
            println("올바르지 않은 입력 형식입니다. 숫자를 입력하세요.")
            scanner.nextLine() // 입력 버퍼 비우기
        } catch (e: Exception) {
            println("오류가 발생했습니다: ${e.message}")
            return
        }
    }

    scanner.close()
}
