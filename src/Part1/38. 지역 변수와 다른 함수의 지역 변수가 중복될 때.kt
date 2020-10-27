package Part1// 변수가 속한 함수가 다를 때도 스코프가 다르기 때문에 변수의 이름이 중복될 수 있음을 이해한다.

fun main(args:Array<String>){
    val a = 52
    println(a)

    printA()
    printA2()
}

fun printA()
{
    val a = 17
    println(a)
}

fun printA2()
{
    val a = 120
    println(a)
}