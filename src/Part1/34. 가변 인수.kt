package Part1

// 개수가 정해지지 않은 매개변수를 만드는 방법을 의미한다.
fun main(args:Array<String>){
    println(C4(1, 2, 3, 4, 5, 6, 7))
    println(C4(32, 57, 12))
    println(C4())
}
fun C4(vararg numbers: Int):Int{
    val count = numbers.size
    var i = 0
    var sum = 0

    while (i < count){
        sum += numbers[i]
        i += 1
    }
    return sum
}