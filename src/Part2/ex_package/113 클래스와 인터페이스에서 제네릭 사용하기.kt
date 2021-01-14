package Part2.ex_package

class Pair113<A,B>(val first: A, val second: B){
    override fun toString() = "$first\n$second"
}

fun main() {
    val pair: Pair113<Int, Double>
    pair = Pair113<Int, Double>(15,9.12)
    println(pair.toString())
}