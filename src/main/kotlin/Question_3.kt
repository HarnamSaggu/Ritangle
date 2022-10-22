fun main() {
    val sequence = "123456".permute().maxByOrNull { s ->
        val n1 = 10  * s[0].digitToInt() +      s[1].digitToInt()
        val n2 = 100 * s[2].digitToInt() + 50 + s[3].digitToInt()
        val n3 = 100 * s[4].digitToInt() + 40 + s[5].digitToInt()
        if (n3 - n2 == n2 - n1) {
            n1 * n2 * n3
        } else {
            -1
        }
    }!!
    println("${sequence[0]}${sequence[1]}, ${sequence[2]}5${sequence[3]}, ${sequence[4]}4${sequence[5]}")
}

fun String.permute(result: String = ""): List<String> =
    if (isEmpty()) listOf(result) else flatMapIndexed { i, c -> removeRange(i, i + 1).permute(result + c) }

/*
a b |  c 5 d | e 4 f
0 1 |  2 . 3 | 4 . 5
 */

// 65, 253, 441
