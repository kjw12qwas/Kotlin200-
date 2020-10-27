package Part2.ex_package

class Product(val id: Int, val name:String){
    operator fun invoke(value: Int){
        println(value)
        println("id: $id\nname:$name")
    }
}

fun main(args:Array<String>){
    val product = Product(762443, "코틀린 200제")
    product(108)
}