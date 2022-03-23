package study04_collection

fun main() {
    val words = listOf("about", "acute", "awesome", "Balloon", "best", "brief", "class", "coffee", "creative")

    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    val filteredWords2 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredWords2)

    val filteredWords3 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()// 무작위
        .take(2)// 그 중 2개
        .sorted()// 정렬
    println(filteredWords3)
}