package Part2.ex_package

interface ClosedRange<T: Comparable<T>> {
    val start: T
    val endInclusive: T
    operator fun contains(value: T): Boolean = value >= start && value <= endInclusive
    fun isEmpty(): Boolean = start > endInclusive
}

fun main() {
    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println(longRange.endInclusive)
    println('*' in charRange)
    println(charRange.isEmpty())
}