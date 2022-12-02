fun main() {
    // A = X = 1 for Rock, B = Y = 2 for Paper, and C = Z = 3 for Scissors
    // 0 - you lost, 3 - draw, and 6 - you won
    // A - X(1) = 1 + 3 = 4
    // A - Y(2) = 2 + 6 = 8
    // A - Z(3) = 3 + 0 = 3
    // B - X(1) = 1 + 0 = 1
    // B - Y(2) = 2 + 3 = 5
    // B - Z(3) = 3 + 6 = 9
    // C + X(1) = 1 + 6 = 7
    // C + Y(2) = 2 + 0 = 2
    // C + Z(3) = 3 + 3 = 6
    fun part1(input: List<String>): Int {
        val rules = mapOf(
            "A X" to 4,
            "A Y" to 8,
            "A Z" to 3,
            "B X" to 1,
            "B Y" to 5,
            "B Z" to 9,
            "C X" to 7,
            "C Y" to 2,
            "C Z" to 6,
        )
        return input.sumOf { rules[it]!! }
    }

    // A for Rock, B for Paper, and C for Scissors
    // X = 0 - you lost, Y = 3 - draw, and Z = 6 - you won
    // A - X(0) = 0 + 3 = 3
    // A - Y(3) = 3 + 1 = 4
    // A - Z(6) = 6 + 2 = 8
    // B - X(0) = 0 + 1 = 1
    // B - Y(3) = 3 + 2 = 5
    // B - Z(6) = 6 + 3 = 9
    // C + X(0) = 0 + 2 = 2
    // C + Y(3) = 3 + 3 = 6
    // C + Z(6) = 6 + 1 = 7
    fun part2(input: List<String>): Int {
        val rules = mapOf(
            "A X" to 3,
            "A Y" to 4,
            "A Z" to 8,
            "B X" to 1,
            "B Y" to 5,
            "B Z" to 9,
            "C X" to 2,
            "C Y" to 6,
            "C Z" to 7,
        )
        return input.sumOf { rules[it]!! }
    }

    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    val input2 = readInput("Day02")
    println(part1(input))
    println(part2(input2))
}
