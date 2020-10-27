package Part2.ex_package

open class AAA67
{
    open var number = 10
        get() {
            println("AAA number Getter 호출됨")
            return field
        }
        set(value) {
            println("AAA number Setter 호출됨")
            field = value
        }
}

class BBB67: AAA67(){
    override var number: Int
        get(){
            println("BBB number Getter 호출됨")
            return super.number
        }
        set(value) {
            println("BBB number Setter 호출됨")
            super.number = value
        }
}

fun main(args:Array<String>){
    val test = BBB67()
    test.number = 5
    test.number
}