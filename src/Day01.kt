fun main() {
    fun part1(input: List<String>): Int {
        return input.maxOf { s -> s.split("\n").sumOf { it.toInt() } }
    }

    fun part2(input: List<String>): Int {
        return input.map { s -> s.split("\n").sumOf { it.toInt() } }.sortedDescending().slice(0..2).sum()
    }

    val testInput = readInputSplintByBlankLines("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInputSplintByBlankLines("Day01")
    val input2 = readInputSplintByBlankLines("Day02")
    println(part1(input))
    println(part2(input2))
}
