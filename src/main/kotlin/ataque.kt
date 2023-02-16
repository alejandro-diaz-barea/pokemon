class ataque(nombre:String, Tipo:String, fuerza:Int, TipoRespuesta: String):tipo(Tipo, TipoRespuesta) {
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
    var ataques = mutableListOf<String>("","","","")
    init {
        Nombre = nombre
        Fuerza = fuerza
    }

    override fun toString(): String {
        return "ataque(Nombre='$Nombre', Tipo='${tipo}ipo', Fuerza=$Fuerza)"
    }


}