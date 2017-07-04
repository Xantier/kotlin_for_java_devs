data class TopShelf(val drinks: List<String>?)

fun main(args: Array<String>){
    val monday = TopShelf(null)
    //println(monday.drinks.get(0))
    println(monday.drinks?.get(0))
}
