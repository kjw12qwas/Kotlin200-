package Part2.ex_package

class Point92(val x:Int, val y: Int)

class Rect{
    lateinit var pt: Point92
    lateinit var pt2 : Point92

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main() {
    val rect = Rect()
    rect.pt = Point92(3,3)
    rect.pt2 = Point92(6,5)

    println("너비 : ${rect.width}")
    println("높이 : ${rect.height}")
    println("넓이 : ${rect.area}")
}