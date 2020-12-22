package Part2.ex_package

interface Parent98 {
    fun follow() : Unit
}

interface Mother98 : Parent98{
    override fun follow() = println("follow his mother")
}

interface Father98 : Parent98{
    override fun follow() = println("follow his father")
}

class Child98: Mother98,Father98{
    override fun follow() {
        println("A child decided to")
        super<Mother98>.follow()
    }
}

fun main() {
    Child98().follow()
}