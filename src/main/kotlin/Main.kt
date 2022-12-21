fun main() {
    print(solution(97))
}

fun solution(a: Int): Int {
    return Integer.parseInt(Integer.toBinaryString(a).reversed(), 2)
}