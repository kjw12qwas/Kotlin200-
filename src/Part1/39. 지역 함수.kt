package Part1// 함수 속에 함수를 선언하는 방법

fun main(args:Array<String>){
    fun F(a: Int,b: Int){
        println(a * b + a - b)
    }
    F(73,1)
    F(4,6)
}