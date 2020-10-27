package Part2.ex_package

open class AAA68
{
    open fun hello() = println("AAA입니다.")
}

class BBB68: AAA68(){
    override fun hello() = println("BBB입니다.")
}

fun main(args:Array<String>){
    val one = AAA68()
    val two = BBB68()
    val three:AAA68 = two

    one.hello()
    two.hello()
    three.hello()
}