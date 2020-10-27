package Part1// 스코프가 다르면 변수의 이름이 중복될 수 있음을 이해한다.

var a = 5

fun main(){
    val a = 30
    println(a)
    foun()
}

fun foun(){
    println(a)
}