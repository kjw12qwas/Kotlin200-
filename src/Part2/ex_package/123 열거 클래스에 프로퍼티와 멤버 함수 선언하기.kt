package Part2.ex_package

enum class Mode123(val number: Int){
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3);

    fun printNumber(){
        println("모드: $number")
    }
}

fun main() {
    val mode: Mode123 = Mode123.ERASER

    println(mode.number)
    mode.printNumber()
}