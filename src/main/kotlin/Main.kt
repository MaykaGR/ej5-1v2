// Clase arma de fuego
open class ArmaDeFuego(private val nombre: String, var municion: Int,
                       private val municionARestar: Int, private val tipoDeMunicion: String,
                       private val danio: Int, private val radio: String)
{
    open fun dispara(): Int{
        municion = municion-municionARestar
        return municion
    }
    open fun recarga(): Int{
        municion = 20
        return municion
    }
}
// Tipos de armas de fuego, clases que heredan de arma de fuego
class Pistola(val nom: String ="Pistola", var municpist: Int = 15,
              val municpistARestar: Int = 1, val tipoDeMunicion: String ="Bla",
              val danio: Int = 3,  val radio: String ="Bla"):
    ArmaDeFuego(nom,municpist,municpistARestar,tipoDeMunicion, danio, radio)
{
    override fun dispara(): Int{
        municpist = municpist-municpistARestar
        return municpist
    }
    override fun recarga(): Int{
        municpist = 15
        return municpist
    }
}
class Rifle(val name: String ="Rifle", var municrif: Int = 6,
            val municrifARestar: Int = 2, val tipoDeMunicion: String ="Bla",
            val danio: Int = 5,  val radio: String = "Bla"):
    ArmaDeFuego(name,municrif,municrifARestar,tipoDeMunicion, danio, radio)
{
    override fun dispara(): Int{
        municrif = municrif-municrifARestar
        return municrif
    }
    override fun recarga(): Int{
        municrif = 6
        return municrif
    }
}
class Bazooka(val nomb: String ="Bazooka", var municbaz: Int = 8,
              val municbazARestar: Int = 3, val tipoDeMunicion: String ="Bla",
              val danio: Int = 10,  val radio: String ="Bla"):
    ArmaDeFuego(nomb,municbaz,municbazARestar,tipoDeMunicion, danio, radio)
{
    override fun dispara():Int{
        municbaz = municbaz-municbazARestar
        return municbaz
    }
    override fun recarga():Int{
        municbaz = 8
        return municbaz
    }
}
fun main() {
  // Instancias de clase
    val pist = Pistola("pist",12, 1, "ligera",3,"pequeña")
    val rifle = Rifle("rifle",8,2,"hueca",5,"mediana")
    val baz = Bazooka("baz",10,3,"explosiva",8,"grande")
    // Lista de armas
    var map: MutableMap<String,ArmaDeFuego> = mutableMapOf()
    var armas = arrayOf(pist,rifle, baz)
    // Asignar 6 aleatoriamente a la lista
    for (i in 0..5){
        var num: Int = (0..2).random()
        map.put(key = "Disparo$i", value = armas[num])
    }
    for (it in map){
    print("${it.value.nombre}, ")}
    println()
    // Dispara cada arma
    for (i in 0..5){
        println("${map.get("Disparo$i")?.nombre}:${map.get("Disparo$i")?.dispara()}")
    }
}
