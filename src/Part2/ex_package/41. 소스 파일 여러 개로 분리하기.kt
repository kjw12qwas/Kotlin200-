package Part2.ex_package

// 소스 파일을 여러 개로 분리하는 방법을 알려준다.
fun max(a: Int, b: Int):Int = if (a > b) a else b

fun min(a: Int, b: Int):Int = if (a < b) a else b

fun abs(num: Int):Int = if (num >= 0) num else - num

fun main(args:Array<String>){
    val a = 20
    val b = -30

    println(max(a, abs(b)))
}