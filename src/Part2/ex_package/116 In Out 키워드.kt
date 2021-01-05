package Part2.ex_package

class AAA116<out T>

class BBB116<in T>

fun main() {
    val aaaSub = AAA116<Int>()

    val aaaSuper: AAA116<Any> = aaaSub

    val bbbSuper = BBB116<Any>()

    val bbbSub: BBB116<Int> = bbbSuper

    val start: AAA116<*> = aaaSub
}