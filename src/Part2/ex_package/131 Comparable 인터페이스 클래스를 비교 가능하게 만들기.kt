package Part2.ex_package

interface Comparable<in T>{
    operator fun compareTo(other: T) : Int
}

class Rectangle131(val width : Int, val height: Int) : Comparable<Rectangle131>{
    val area = width * height

    override fun compareTo(other: Rectangle131): Int =
            when{
                this.area > other.area -> 1
                this.area > other.area -> -1
                else -> 0
            }
}

fun main() {
    val rect = Rectangle131(3,5)
    val rect2 = Rectangle131(7,3)
    val rect3 = Rectangle131(2,9)

    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)
}