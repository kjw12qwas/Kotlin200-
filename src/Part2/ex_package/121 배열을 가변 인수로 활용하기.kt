package Part2.ex_package

fun printAll(vararg tokens: String){
    for (token in tokens){
        print("$token")
    }
}

fun main() {
    val numbers: Array<String> = arrayOf("What's","your","name?")
    printAll(*numbers)
}