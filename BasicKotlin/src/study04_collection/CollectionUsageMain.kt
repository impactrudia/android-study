package study04_collection

fun main() {
    // forEach
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 31,
        "Ann" to 23,
        "Barbara" to 42
    )
    peopleAges.forEach {
        println("${it.key} is ${it.value}")
    }
    println()

    // map
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
    println()

    // filter
    val filterNames = peopleAges.filter { it.key.length < 4 }
    println(filterNames)
    println(filterNames.map { "${it.key} is ${it.value}" }.joinToString(", "))
    println()
}
