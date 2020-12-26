package Part2.ex_package

fun returnFunc(num: Int): () -> Unit = { println(num) }
fun main() {
    val f: () -> Unit = returnFunc(30)
    f()
}