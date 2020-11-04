package Part2.ex_package

fun main() {
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?){
    if (any == null){
        println("null이 들어왔습니다.")
        return
    }

    println(any.toString())
}