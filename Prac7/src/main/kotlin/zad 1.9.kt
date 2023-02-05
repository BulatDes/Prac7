fun main(){
    //задание 1: задача 9
    try{
        println("Введите три числа")
        var a:Double
        var b:Double
        var c:Double
        var ave:Double
        var gave:Double
        a= readln().toDouble()
        b=readln().toDouble()
        c= readln().toDouble()
        ave=(a+b+c)/3
        gave=(Math.pow(a*b*c,1.0/3.0))
        println("Среднее арифметическое: $ave \n Среднее геометрическое: $gave")
    }catch (e:Exception){
        println(e.message)
    }
}