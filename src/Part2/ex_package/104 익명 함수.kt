package Part2.ex_package

fun main() {
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit {
        println("Hello $number")
    }
    instantFunc(33)
    instantFunc.invoke(33)
}