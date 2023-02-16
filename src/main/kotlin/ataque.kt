class ataque(nombre:String,Tipo:String,fuerza:Int):tipo(Tipo) {
    var Nombre = " "
    var Fuerza = 0
        set(value) {
            if(value<0){
                throw Exception("La fuerza no puede ser menor a 0")
            }
            else{
                field = value
            }
        }

    init {
        Nombre = nombre
        Fuerza = fuerza
    }

    override fun toString(): String {
        return "ataque(Nombre='$Nombre', Tipo='${tipo}ipo', Fuerza=$Fuerza)"
    }


}