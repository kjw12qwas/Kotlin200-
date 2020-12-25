package Part2.ex_package

fun main() {
    val instantFunc: (Int) -> Unit
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}