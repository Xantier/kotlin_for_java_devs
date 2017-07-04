import java.util.*

class EmptyClass
interface MarkeInterface
class WithConstructor(val value: String) : MarkeInterface
class WithMembers(val value: String) {
    fun doFun() = "Fun!"
}

object Singleton {
    val staticity = "Not Quite, but close"
}
class Companied{
    companion object{
        val truly = "'Nearly' truly static"
    }
}
val value = Companied.truly

object initialized {
    val thing: String

    init {
        thing = "Hello"
    }
}

class LateBloomer {
    lateinit var thang: String
    fun doTheInit(str: String) {
        thang = str
    }
/*
    @Autowired
    lateinit var thang: String
    @Inject
    lateinit var thong: String
*/
}

data class PiedPiper(val weissman: String) : NextBigThing()
data class PiperChat(val pakistaniDenzel: String) : NextBigThing() {
    operator fun plus(internet: PiedPiper) = when (pakistaniDenzel) {
        "fired" -> internet
        else    -> this
    }
}

sealed class NextBigThing {
    infix fun until(num: Int) = when (this) {
        is PiedPiper -> weissman.toInt() - num
        is PiperChat -> 2 - num
    }
}

fun getNextBigThing(): NextBigThing {
    val randomInt = Random()
    return when(randomInt.nextInt(2)){
        1 -> PiedPiper("23")
        else -> PiperChat("Dinesh")
    }
}


fun main(args: Array<String>) {

    val matchable: NextBigThing = getNextBigThing()
    val drivingForce = when (matchable) {
        is PiperChat -> matchable.pakistaniDenzel
        is PiedPiper -> matchable.weissman
    }
    val carDoors = if (matchable is PiperChat) {
        "--(ツ)--"
    } else {
        "¯\\_(ツ)_/¯"
    }

    val funType: (num: Int) -> Int = { num -> num * num }
    val funType2: (Int) -> Int = { it * it }
    val funfunType: (Int, (Int) -> Int) -> Int = { num, func ->
        func(num) * func(num)
    }
    val games = PiedPiper("23")
    val `fun` = PiperChat("Dinesh")
    var eye = 2
    val score: Int = `fun` + games until --eye

    println("uber".`is`("".fine))
}



inline fun <S, reified T> inliner(other: S, typed: T) {
    if (other is T) {
        print("Same Types")
    }
}

val String.fine: String
    get() = " a dumpster fire"

fun String.`is`(unused: String) = this + "is $fine"
