package Part2.ex_package

interface ValueContainer{
    fun getValue(): Int

}

class AAA115: ValueContainer {
    override fun getValue(): Int = 1102
}

class BBB115 : ValueContainer{
    override fun getValue(): Int = 127
}

fun <T : ValueContainer> T.printValue(){
    println(this.getValue())
}

fun main() {
    AAA115().printValue()
    BBB115().printValue()
}