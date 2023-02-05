fun main(){
    // задание 2: задача 25
    try{
        println("Введите Координаты x,y")
        var x:Double
        var y:Double
        x= readLine()!!.toDouble()
        y= readLine()!!.toDouble()
        println("Введите радиус")
        var r:Double
        r= readLine()!!.toDouble()
        var dl:Double
        var ras:Double
        ras=0.0;
        dl=Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0))
        when{
            (dl>r)->{ras=dl-r;println("Расстояние до контура круга $ras ")}
            (dl==r)->println("Координаты в контуре")
            (dl<r)->{ras=r-dl;println("Расстояние до контура круга $ras ")}
        }

    }catch (ex:Exception){
        println(ex.message)
    }
}