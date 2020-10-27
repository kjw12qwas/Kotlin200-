package Part1

fun main(args:Array<String>){
    println(myFunction())
    println(myFunction() + 10)
}

fun myFunction() : Int{
    val a = 3
    val b = 5
    println("Part1.getA: " + a + ",b: " + b)
    return a + b
}