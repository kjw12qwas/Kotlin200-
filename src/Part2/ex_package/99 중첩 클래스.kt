package Part2.ex_package

class Outer99{
    class Nested99{
        fun hello() = println("중첩된 클래스")
    }
}

fun main() {
    val instance : Outer99.Nested99 = Outer99.Nested99()
    instance.hello()
}