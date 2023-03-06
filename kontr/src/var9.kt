class var9(var ename:String,  var efamilia:String,  var eothestvo:String, var ecolledg:String,  var especial:String,var egroup:String,var erogdenie:String):Student( ename, efamilia, eothestvo, ecolledg, especial, egroup, erogdenie) {
    override fun Haract()
    {
         println("Обучающийся $name $familia $othestvo в группе $group, рожден $rogdenie")
    }

    override fun Info()
    {
        println("Студент $name $familia $othestvo  проходит обучение в $colledg на специальности $special ")
    }
}