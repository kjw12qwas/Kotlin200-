package Part1

fun main(args:Array<String>){
    println(C1(1))
    println(C2(1, 5))
}

fun C1(a : Int): Double{
    return a * 10.2 + 38
}

fun C2(a:Int, b:Int): Double{
    return a * b * 1.12 + 10
}