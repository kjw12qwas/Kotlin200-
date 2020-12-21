package Part2.ex_package

/*open class Person96
{
    open fun getSalary() = 0
}*/
abstract class Person96{
    abstract fun getSalary() : Int
}

class Student96(private val tuition: Int) : Person96()
{
    override fun getSalary() = -tuition
}

class Professor96(private val classCount: Int) : Person96(){
    override fun getSalary(): Int = classCount * 200
}

class Employee(private val initial: Int, private val years: Int) : Person96(){
    override fun getSalary(): Int = initial * (1.0 + years / 10.0).toInt()
}

fun getFinance(vararg persons: Person96): Int{
    var i = 0
    var finance = 0
    while (i < persons.size){
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main() {
    val finance = getFinance(Student96(330), Student96(330), Professor96(1), Professor96(2),
        Employee(1300,2))
    println("학교 재정 : $finance 만원")
}
