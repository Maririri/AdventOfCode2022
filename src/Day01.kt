fun main() {
    fun part1(input: List<String>): Int {
        return input.maxOf { s -> s.lines().sumOf { it.toInt() } }
    }

    fun part2(input: List<String>): Int {
        return input.map { s -> s.lines().sumOf { it.toInt() } }.sortedDescending().take(3).sum()
    }

    val testInput = readInputSplintByBlankLines("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInputSplintByBlankLines("Day01")
    val input2 = readInputSplintByBlankLines("Day01_2")
    println(part1(input))
    println(part2(input2))
}
