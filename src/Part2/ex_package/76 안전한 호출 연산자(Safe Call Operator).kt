package Part2.ex_package

fun main() {
    var obj: Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년11월20일"
    obj?.area = 21_6712
    obj?.print()
}