package Part2.ex_package

interface Printable97{
    fun print(): Unit
}

class AAA97 : Printable97{
    override fun print() {
        println("Hello")
    }
fun print(anything : Printable97){
    anything.print()
}

fun main() {
    print(AAA97())
}
}
