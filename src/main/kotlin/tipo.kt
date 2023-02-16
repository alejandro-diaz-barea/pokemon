open class tipo(Tipo:String) {
    var tipos = mutableListOf<String>("acero", "agua", "bicho", "dragon", "electrico", "fantasma", "fuego", "hada", "hielo", "lucha",
        "normal", "planta", "psiquico", "roca", "siniestro", "tierra", "veneno", "volador")
    var tipo = " "
        get() {
            return field
        }
        set(value) {
            if(value !in tipos){
                IllegalArgumentException("El tipo no es válido")
            }
            else{
                field = value 
            }
        }
    init {
        tipo = Tipo
    }
}