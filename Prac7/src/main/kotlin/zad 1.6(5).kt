fun main(){
    //задание 1: задача 6(5)
    try{
        println("Введите х")
        var x:Double
        x= readln().toDouble()
        println("Введите у")
        var y:Double
        y= readln().toDouble()
        var rez:Double
        rez=Math.sqrt(x+Math.sqrt(Math.pow(x,2.0)+4*Math.pow(y,2.0)))
        println(rez)
    }catch (ex:Exception){
        println(ex.message)
    }
}