package com.example.myapplication

fun main() {
    var num1 = 30
    var num2 = 10

    // 덧셈 연산자(+)사용해서 num1과 num2를 더한후에 plusResult에 대입함
    var plusResult = num1 + num2
    println("num1 + num2는 ${plusResult}이야")

    // 뺄셈 연산자(-)사용해서 num1에서 num2를 뺀후에 minusResult에 대입함
    var minusResult = num1 - num2
    println("num1 - num2는 ${minusResult}이야")

    // 곱셈 연산자(*)사용해서 num1과 num2를 곱한후에 multipleResult에 대입함
    var multipleResult = num1 * num2
    println("num1 * num2는 ${multipleResult}이야")

    // 나눗셈 연산자(/)사용해서 num1에서 num2를 나눈후에 divideResult에 대입함
    var divideResult = num1 / num2
    println("num1 / num2는 ${divideResult}이야")

    // num2를 10에서 7로 변경
    num2 = 7

    // 나머지 연산자(%)사용해서 num1에서 num2를 나눈 나머지를 modResult에 대입함
    var modResult = num1 % num2
    println("num1 % num2는 정수로 ${modResult}야")
}