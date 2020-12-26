package Part2.ex_package

fun decorate(task: () -> Unit){
    println("=== 작업 시작 ===")
    task()
    println("=== 작업 끝 ===")
}

fun main() {
    decorate ({
        val a= 10; val b = 5
        println("$a + $b = ${a+b}")
    })
    decorate ({
        println("some"); println("tasks")
    })
}