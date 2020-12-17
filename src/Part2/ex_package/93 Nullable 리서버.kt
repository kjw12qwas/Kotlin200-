package Part2.ex_package

fun String?.isNumber(){
    if (this== null){
        println("문자열이 null 입니다.")
    }
}

fun main() {
    val empty:String? = null
    empty.isNumber()
}