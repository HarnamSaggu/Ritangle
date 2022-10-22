fun main() {
    find10DigitComposite()
}

fun find10DigitComposite() {
    for (i in 1L..9L) {
        bruteForce(i)
    }
}

fun bruteForce(n: Long): Long {
    val i = n.toString().length
    if (i == 10) {
        println(n)
        return n
    }

    for (j in 0L..9L) {
        if (n.toString().contains(j.toString())) {
            continue
        }

        val new = n * 10 + j
        if (new % (i + 1) == 0L) {
            bruteForce(new)
        }
    }

    return -1
}

// 3816547290
