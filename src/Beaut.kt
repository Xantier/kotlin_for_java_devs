data class Lunch(val bread: String, val topping: String)
val yumyum = Lunch("Toast", "Avocado")
fun main(args: Array<String>){
    val buyHouse: (Lunch) -> Unit = {
        val (_, topping) = it
        when(topping){
            "Avocado" -> println("Not a chance")
            else -> println("Hmmm... still probably no")
        }
    }
    buyHouse(yumyum)
}