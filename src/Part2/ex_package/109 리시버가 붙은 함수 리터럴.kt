package Part2.ex_package

fun main() {
    val makeSure:Int.(left:Int, right:Int) -> Int

    makeSure = { left : Int, right : Int ->
        if (this < left) left
        else if (this > right) right
        else this
    }

    println(15.makeSure(20,40))
    println(18.makeSure(0,50))
    println(25.makeSure(0,19))
}