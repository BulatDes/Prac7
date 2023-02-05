fun main(args: Array<String>) {
    try {
        var n1:Int
        var n2:Int
        var n3:Int
        println("Введите кол-во рекламаций 1 товара")
        n1=readLine()!!.toInt()
        println("Введите кол-во рекламаций 2 товара")
        n2=readLine()!!.toInt()
        println("Введите кол-во рекламаций 3 товара")
        n3=readLine()!!.toInt()
        var max:Int=0
        if(n1<0 || n2<0 || n3<0) {
            println("Не может быть отрицательного количества рекламаций")
        }
        else {
            when {
                (n1 > n2 && n1 > n3) -> max = n1
                (n1 < n2 && n2 > n3) -> max = n2
                (n3 > n2 && n1 < n3) -> max = n3
            }
            if (max < 5) println("Все товары хорошие")
            else println("Есть плохие товары")
        }
    }catch(ex:Exception){
        println(ex.message)
    }
}