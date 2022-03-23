package study04_collection

fun main(args: Array<String>) {
    // list
    val numbers = listOf(0, 3, 7, 8, 0, 2, 3, 5)
    println("list: ${numbers}")
    println("sorted: ${numbers.sorted()}")
    println()

    // set
    val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}")
    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")
    println("contains 7 : ${setOfNumbers.contains(7)}")
    println()

    // map
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    peopleAges["Fred"] = 31
    println(peopleAges)
    println()

}