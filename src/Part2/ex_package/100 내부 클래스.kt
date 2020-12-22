package Part2.ex_package

class Outer100(private val value: Int){
    fun print(){
        println(this.value)
    }

    inner class Inter100(private val innerValue: Int){
        fun print(){
            this@Outer100.print()
            println(this.innerValue + this@Outer100.value)
        }
    }
}

fun main() {
    val instance: Outer100 = Outer100(610)
    val innerIntance : Outer100.Inter100 = instance.Inter100(40)
    innerIntance.print()
}