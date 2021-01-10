package Part2.ex_package

infix fun <A,B> A.to(that:B):Pair128<A,B> = Pair128(this,that)


fun main() {
    val test : Pair128<Int,Double> = 10 to 3.14
}