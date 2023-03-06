import kotlinx.coroutines.*
suspend fun main()=coroutineScope{
    println("Введите количество  функций")
    var n:Int= readln()!!.toInt()
    if(n>0)
    {
        for(i in 1..n){
            println("Введите имя студента")
            var name:String= readln()!!.toString()
            println("Введите фамилию студента")
            var familia:String= readln()!!.toString()
            println("Введите отчество студента")
            var othestvo:String= readln()!!.toString()
            println("Введите колледж студента")
            var colledg:String= readln()!!.toString()
            println("Введите специальность студента")
            var special:String= readln()!!.toString()
            println("Введите группу студента")
            var group:String= readln()!!.toString()
            println("Введите дату рождения студента")
            var rogdenie:String= readln()!!.toString()
            if(name==""&&familia==""&&othestvo==""&&colledg==""&&special==""&&group==""&&rogdenie=="")println("не все данные введены")
            else{
                var student1=var9(name,familia,othestvo,colledg,special,group,rogdenie)
                launch {
                    student1.Haract()
                    delay(1000)
                }
                delay(3000)
                student1.Info()
            }
    }

}
    else println("не может быть отрицательным")
}