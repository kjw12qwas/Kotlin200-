package Part2.ex_package

interface Plusable<T>
{
    operator fun plus(other : T) : T
}

class Rectangle1(val width: Int, val height: Int) : Plusable<Rectangle1>
{
    override fun plus(other: Rectangle1) = Rectangle1(
            width + other.width, height + other.height
    )
    override fun toString() = "width: $width, height : $height"
}

fun main() {
    val rect = Rectangle1(10,5)
    val rect2 = Rectangle1(3,8)

    println(rect + rect2)
}