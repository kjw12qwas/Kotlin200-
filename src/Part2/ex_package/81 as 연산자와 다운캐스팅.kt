package Part2.ex_package

fun main() {
    val person: Person64 = Student("John",32,20171218)
    val person2: Person64 = Person64("Jack",29)

    var person3:Student = person as Student
    person3 = person2 as Student
}