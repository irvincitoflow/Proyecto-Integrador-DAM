package mx.edu.utez.proyectointegrador.data.model

data class Mascota(
    val idMascota: Int,
    val nombre: String,
    val especie: String,
    val raza: String,
    val edad: Int,
    val peso: Double,
    val fotografia: Int,
    val idUsuario: Int
)