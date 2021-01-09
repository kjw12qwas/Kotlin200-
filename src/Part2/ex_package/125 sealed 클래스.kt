package Part2.ex_package

sealed class Outer{
    class One: Outer()
    class Two: Outer()
    class Three : Outer()
}

// class Four: Outer()

fun main() {
    val instance: Outer = Outer.Three()

    val text: String = when(instance){
        is Outer.One -> "첫 번째"
        is Outer.Two -> "두 번째"
        is Outer.Three -> "세 번째"
    }
    println(text)
}