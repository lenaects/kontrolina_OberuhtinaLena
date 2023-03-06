abstract class Student ( var name:String,  var familia:String,  var othestvo:String, var colledg:String,  var special:String,var group:String,var rogdenie:String):StudentInterfase {

override  fun Haract(){
    println("Обучающийся")
}
    override fun Info(){
        println("Студент $name $familia $othestvo  проходит обучение в $colledg на специальности $special ")
    }
}