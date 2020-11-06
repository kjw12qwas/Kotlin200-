package Part2.ex_package

private var num = 10 // Test.kt 파일 내에서만 접근 가능

private fun print() // Test.kt 파일 내에서만 접근 가능
    = print(num)

public fun hello(value: Int) // 어디에서나 접근 가능
{
    num = value
    print()
}

public class Person83(age:Int) // 어디에서나 접근 가능
{
    // 디폴트 Setter를 private으로 지정. Setter는 Person 클래스 내부에서만 접근 가능
    public var age = age
        private set

    // Getter를 public으로 지정. Getter는 어디에서나 접근 가능
    public val isYoung public get() = age < 30
}

fun main() {
    // num = 5 에러
    hello(15)

    var person83 = Person83(10)
    println(person83.age)
    // person.age = 20 에러

    println(person83.isYoung)
}