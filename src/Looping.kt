fun doFidgeting(speed: Int) {
    for (i in 0..speed) {
        println("Look ma, spinning this fast $i!")
    }
}

val colors = listOf("red", "blue", "yellow", "green")

class FidgetSpinner(var amount: Int = 0) {
    fun buyMore() {
        while (colors[amount] != "green") {
            doFidgeting(amount++)
        }
    }
    fun reset(){
        amount = 0
    }
}

fun main(args: Array<String>){
    val dealz = FidgetSpinner(2)
    dealz.buyMore()
    dealz.reset()
    dealz.buyMore()
}