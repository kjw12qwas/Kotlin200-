package Part2.ex_package

fun main() {
    val instantFunc:(Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}