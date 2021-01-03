package Part2.ex_package

/*
이렇게 하면 오류남
fun<T> check(){
    val number = 0
    if (number is T){
        println("T는 Int 타입 입니다.")
    }
}*/

inline fun <reified T> check() {
    val number = 0
    if (number is T){
        println("T는 Int타입 입니다.")
    }
}

fun main() {
    check<Int>()
}
