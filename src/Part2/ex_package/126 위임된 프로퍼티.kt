package Part2.ex_package

import kotlin.reflect.KProperty

class Sample{
    var number: Int by OnlyPositive()
}

class OnlyPositive {
    private var realValue: Int = 0

    operator fun getValue(thisRef:Any?, property: KProperty<*>): Int{
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        realValue = if (value > 0) value else 0
    }
}

fun main() {
    val sample = Sample()

    sample.number = -50
    println(sample.number)

    sample.number = 100
    println(sample.number)
}