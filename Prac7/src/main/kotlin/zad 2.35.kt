fun main(){
    //задание 2 : задача 35
    try {
        println("Введите интервал (-k;k)")
        var k: Double
        var a:Double
        var b:Double
        var x1:Double
        var x2:Double
        k = readLine()!!.toDouble()
        if (k < 0) {
            k=Math.sqrt(Math.pow(k,2.0))
        }
        println("Введите число а в уравнении (x^2+ax+b=0")
        a=readLine()!!.toDouble()
        println("Введите число b в уравнении (x^2+ax+b=0")
        b=readLine()!!.toDouble()
        var d:Double
        d=Math.pow(a,2.0)-4*b
        if(d>=0) {
            if(d==0.0){
                x1=(-1*a)/2
                if(x1>=(-1*k) && x1<=k){
                    println("В уравнении один корень и он находится в интервале")
                }else println("В уравнении один корень и он не находится в интервале")
            }else {
                x1 = ((-1) * a + Math.sqrt(d)) / 2
                x2 = ((-1) * a - Math.sqrt(d)) / 2
                when {
                    ((x1 > (-1 * k) && x1 < k) && ((x2 > (-1 * k) && x2 < k))) -> println("Оба корня находятся в интервале")
                    ((x1 > (-1 * k) && x1 < k) || ((x2 > (-1 * k) && x2 < k))) -> println("Один из корней находится в интервале")
                    else -> println("Оба корня находятся вне интервала")
                }
            }
        }
        else println("Нет корней")
    }
    catch (ex:Exception){
        println(ex.message)
    }
}