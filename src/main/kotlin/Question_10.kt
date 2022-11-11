import kotlin.math.acos
import kotlin.math.pow
import kotlin.math.sin

fun main() {
    val areas = "123456789".permute().map { s ->
        val a: Double = (s[0 + 0].digitToInt() * 100 + s[0 + 1].digitToInt() * 10 + s[0 + 2].digitToInt()).toDouble()
        val b: Double = (s[3 + 0].digitToInt() * 100 + s[3 + 1].digitToInt() * 10 + s[3 + 2].digitToInt()).toDouble()
        val c: Double = (s[6 + 0].digitToInt() * 100 + s[6 + 1].digitToInt() * 10 + s[6 + 2].digitToInt()).toDouble()
        val theta: Double = acos((a.pow(2) + b.pow(2) - c.pow(2)) / (2 * a * b))
        val area: Double = 0.5 * a * b * sin(theta)
        Pair(area, listOf(a.toInt(), b.toInt(), c.toInt()))
    }.filter { !it.first.isNaN() && it.first > 0.1 }.sortedBy { it.first }
    println(areas.first())
    println(areas.last())
}

//Q = 3094.0690744551866, [158, 279, 436]
//P = 307389.3321831452, [941, 852, 763]
