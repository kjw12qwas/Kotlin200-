package Part2.ex_package

import kotlin.Array


fun main() {
    val intergers: Array<Int> = arrayOf(10,20,30,40)

    println(intergers.size)
    println(intergers[1])

    for (i in intergers)
        println("$i ")
}