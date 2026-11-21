package mx.edu.utez.proyectointegrador.data.model

data class Mascota(
    val id: String = "",
    val nombre: String = "",
    val especie: String = "",
    val raza: String = "",
    val edad: Int = 0,
    val peso: Double = 0.0
)