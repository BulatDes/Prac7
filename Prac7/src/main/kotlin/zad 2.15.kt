fun main(){
    //задание 2:задача 15
    try {
        println("Введите трехзначное число")
        var num: Int
        num = readln().toInt()
        var des: Int
        var ed: Int
        var sot: Int
        if (num > 99 && num < 1000) {
            sot = num / 100
            des = (num / 10) % 10
            ed = num % 10
            when{
                (ed < des && des < sot)->println("Цифры в числе имеют убывающую последовательность")
                (ed > des && des > sot)->println("Цифры в числе имеют возрастающую последовательность")
                (ed==des && des==sot)->println("В цифре одинаковые числа")
                else-> println("Цифры не имеют упорядоченной последовательности")
            }
        }
        else println("Введите ТРЕХзначное число!!!")
    }catch (ex:Exception){
        println(ex.message)
    }
}