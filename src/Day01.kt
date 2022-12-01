fun main() {
    fun part1(input: List<String>): Int {
        return input.maxOf { s -> s.split("\n").sumOf { it.toInt() } }
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInputSplintByBlankLines("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInputSplintByBlankLines("Day01")
    println(part1(input))
//    println(part2(input))
}
