package Part2.ex_package

enum class Mode124{
    SELECTION, PEN, SHAPE, ERASER
}

fun main() {
    val shapeMode: Mode124 = Mode124.SHAPE
    println(shapeMode.name)
    println(shapeMode.declaringClass)

    val modes: Array<Mode124> = Mode124.values()
    for (mode: Mode124 in modes){
        println(mode)
    }
    println(Mode124.valueOf("PEN").ordinal)
}