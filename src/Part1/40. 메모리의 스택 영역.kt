package Part1// 지역 변수가 실제로 어디에 생성되는 지 살펴본다.

fun main(args:Array<String>){
    val a = -36
    val result = ab(a)
    println(result)
}

fun ab(a : Int): Int{
    return if (a >= 0)
        a
    else -a
}