package Part2.ex_package

fun main() {
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa","코코아"))
}