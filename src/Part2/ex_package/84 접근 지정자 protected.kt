package Part2.ex_package

open class AAA83(protected  val number : Int)

class BBB83(number: Int) : AAA83(number){
    fun printNumber(){
        //AAA 클래스의 NUMBER 프로퍼티에 접근 가능
        println(number)
    }
}

fun main() {
    val test = BBB83(36)
    // println(test.number) 에러
    test.printNumber()
}