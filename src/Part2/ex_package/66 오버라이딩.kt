package Part2.ex_package

/*
open class AAA65
{
    open fun func() = println("AAA")
}

class BBB65: AAA65()
{
    override fun func() {
        super.func()
        println("BBB")
    }
}

fun main(args:Array<String>){
    AAA65().func()
    BBB65().func()
}*/
open class  AAA65
{
    open fun func() = println("AAA")
}

class BBB66: AAA65(){
    override fun func() {
        super.func()
        println("BBB")
    }
}

fun main(args:Array<String>){
    AAA65().func()
    BBB66().func()
}