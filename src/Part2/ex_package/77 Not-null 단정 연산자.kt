package Part2.ex_package

fun main() {
    var obj: Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
    obj!!.print()
}