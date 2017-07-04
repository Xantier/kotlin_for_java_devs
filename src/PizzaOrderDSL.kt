import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

data class Pizza(val name: String, var toppings: List<Topping> = emptyList()) {
    val price: Int by PriceCalculator()
    override fun toString() = "name=$name, price=$price, toppings=$toppings"
}

fun Pizza.`with`(topper: () -> List<Topping>): Pizza =
    apply { toppings = topper() }

class PriceCalculator : ReadOnlyProperty<Pizza, Int> {
    override fun getValue(thisRef: Pizza, property: KProperty<*>) =
        thisRef.toppings.fold(0) { acc, it ->
            acc + (it as BaseTopping).price
        }
}

interface Topping {
    val unitPrice: Int
    val name: String
}

abstract class BaseTopping(val priceProvider: Topping) : Topping by priceProvider {
    var amount: Int = 0
    operator fun plus(that: Topping): List<Topping> = listOf(this, that)
    override fun toString() = "{name=$name, price=$unitPrice, amount=$amount}"
}

class PriceAndNameProvider(override val name: String, override val unitPrice: Int) : Topping

class Cheese : BaseTopping(PriceAndNameProvider("toppingsCheese", 3))
class Ananas : BaseTopping(PriceAndNameProvider("Ananas", 4))
class Anchovy : BaseTopping(PriceAndNameProvider("Anchovy", 6))

val BaseTopping.price: Int
    get() = unitPrice * amount

infix fun Int.of(topping: BaseTopping): BaseTopping =
    topping.also {
        it.amount = this
    }

fun order(name: String, hoef: Pizza.() -> Pizza) = Pizza(name).hoef()

fun main(args: Array<String>) {
    println(
        order("Kotlinante") {
            `with` {
                (3 of Cheese()) +
                    (2 of Anchovy()) +
                    (2 of Ananas())
            }
        })
}