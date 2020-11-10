package Part2.ex_package

fun String.isNumber() : Boolean{
    var i = 0
    while (i < this.length){
        if (!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }

    return true
}

fun main() {
    println("1234567890".isNumber())
    println("500원".isNumber())
}