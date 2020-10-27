package Part2.ex_package

class Size(width:Int,height:Int){
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area : Int

    init {
        area = width * height
    }
}

fun main(args:Array<String>){
    val size = Size(10,50)
    println(size.area)
}