package Part2.ex_package

enum class Mode{
    SELECTION, PEN, SHAPE, ERASER
}

fun main() {
    val mode: Mode = Mode.PEN

    when (mode){
        Mode.SELECTION -> println("선택 모드")
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("지우개 모드")
    }
}