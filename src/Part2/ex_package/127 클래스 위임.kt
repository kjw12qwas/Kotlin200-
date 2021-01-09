package Part2.ex_package

interface  Plusable127{
    operator fun plus(other: Int): Int
}

class ClassDelegator: Plusable127{
    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}

class Sample127 : Plusable127 by ClassDelegator()

fun main() {
    println(Sample127() + 10)
}