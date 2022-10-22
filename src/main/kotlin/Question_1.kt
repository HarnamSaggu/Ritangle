import kotlin.random.Random

fun main() {
    val cubes = listOf(
//      1| 2| 3| 4| 5| 6| 7| 8| 9| 10| 11| 12
        3, 3, 3, 3, 3, 3, 3, 3,
        2, 2, 2, 2, 2, 2, 2, 2, 2,  2,  2,  2,
        1, 1, 1, 1, 1, 1,
        0
    )

    var runs = 0.0
    var successes = 0.0
    print("Runs: ")
    readLine()?.let { repeat(it.toInt()) {
        val bag = cubes.toMutableList()
        val selection = mutableListOf<Int>()

        repeat(3) {
            val index = Random.nextInt(bag.size)
            selection.add(bag[index])
            bag.removeAt(index)
        }

        if (selection.sum() == 4) {
            successes++
        }
        runs++
    } }

    println(successes / runs)
}

// 0.10046305 [100_000_000]
