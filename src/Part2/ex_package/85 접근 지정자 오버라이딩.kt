package Part2.ex_package

open class AAA85(protected open val number : Int){
    protected open fun hello(){
        println("hello")
    }
}

class BBB85(number: Int) : AAA85(number){
    public override val number : Int
    get() = super.number

    public override fun hello() {
        super.hello()
    }
}

fun main() {
    val b = BBB85(26)
    val a : AAA85 = b
    /* println(a.nubmer) 에러
    a.hello() 에러
     */
    println(b.number)
    b.hello()
}