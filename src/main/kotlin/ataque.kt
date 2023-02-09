class ataque(nombre:String,tipo:String,fuerza:Int) {
    var Nombre = " "
    var Tipo = " "
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
        Tipo = tipo
        Fuerza = fuerza
    }

    override fun toString(): String {
        return "ataque(Nombre='$Nombre', Tipo='$Tipo', Fuerza=$Fuerza)"
    }


}