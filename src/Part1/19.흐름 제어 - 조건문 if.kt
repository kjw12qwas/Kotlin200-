package Part1

fun main(args:Array<String>){
    var a = 15
    var b = 11
    if (a > b){
        println("if 안으로 들어옴")
        a -= b
    }
    println(a)
}