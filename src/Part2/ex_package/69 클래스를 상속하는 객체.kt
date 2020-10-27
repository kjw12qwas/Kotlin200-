package Part2.ex_package

open class Person69(val name:String, val age: Int){
    open fun print(){
        println("이름:$name")
        println("나이:$age")
    }
}

fun main(args:Array<String>){
    val custom:Person69 = object : Person69("Alan",23){
        override fun print() {
            println("It's a object")
        }
    }
    custom.print()
}