package Part2.ex_package

class Point63(var x:Int = 0, var y:Int = 0)
{
    //base를 원점으로 생각했을 때의 좌표를 반환한다.
    infix fun from  (base: Point63): Point63
    {
        return Point63( x -base.x, y -base.y)
    }
}

fun main(args:Array<String>){
    val pt = Point63(3, 6) from Point63(1,1)
    println(pt.x)
    println(pt.y)
}