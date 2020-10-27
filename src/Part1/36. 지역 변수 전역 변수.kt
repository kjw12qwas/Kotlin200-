package Part1

// 지역 변수와 전역 변수, 그리고 변수의 유효 범위(Scope)에 대해 알아본다.
var count = 0

fun main(args:Array<String>){
    val a = 15
    println(a)

    count += 1
    printCount()
    println(count)
}
fun printCount()
{
    println(count)
    count += 1
}