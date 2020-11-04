package Part2.ex_package

class Professor(name:String, age: Int) : Person64(name,age)

fun main() {
    val person: Person64 = Student("Mark Zuckereberg",33,20171225)
    print("${person is Person}")
    print("${person is Student}")
    print("${person is Professor}")

    val person2:Person64 = Professor("Kim",48)
    print("${person2 is Person}")
    print("${person2 is Student}")
    print("${person2 !is Professor}")
}