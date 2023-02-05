fun main(){
    //задание 2: задача 5
    try{
        println("Введите 2 целых числа")
        var per:Int
        var vtor:Int
        per= readln().toInt()
        vtor= readln().toInt()
            when {
                (per % 2 == 0 && vtor % 2 == 0) -> println("оба числа четные")
                (per % 2 != 0 && vtor % 2 != 0) -> println("Оба числа нечетные")
                else -> println("одно четное другое нечетное")
            }
    }catch(ex:Exception){
        println(ex.message)
    }
}