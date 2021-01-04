package Part2.ex_package

class Pair<A,B>(val first: A, val second: B){
    override fun toString() = "$first\n$second"
}

fun main() {
    val pair: Pair<Int, Double>
    pair = Pair<Int, Double>(15,9.12)
    println(pair.toString())
}