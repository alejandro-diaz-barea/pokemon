class pokemon(id:Int,nombre:String,vida:Int,tipo:String) {
    var id = 0
        set(value) {
            if(value<=0){
                throw Exception("El id no puede ser menor a 0")
            }
            else{
                field = value
            }
        }
    var nombre = " "
    var vida = 0
    var tipo = " "

    init {
        this.id = id
        this.nombre = nombre
        this.vida = vida
        this.tipo = tipo
        if(id<0){
            throw Exception("El id no puede ser menor a 0")
        }
    }

    override fun toString(): String {
        return "Hola mi nombre es $nombre, tengo $vida de vida y soy de tipo $tipo"
    }


}
