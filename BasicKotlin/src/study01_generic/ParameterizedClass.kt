package study01_generic

class ParameterizedClass<A>(private val value: A) {
    fun getValue(): A {
        return value
    }
}

val parameterizedClass = ParameterizedClass("string-value")
val res = parameterizedClass.getValue()

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return value
    }
}

val parameterizedProducer = ParameterizedProducer("string")

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

val parameterizedConsumer = ParameterizedConsumer<Number>()

fun copy(from: Array<out Any>, to: Array<Any?>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

val ints: Array<Int> = arrayOf(1, 2, 3)
val any: Array<Any?> = arrayOfNulls(3)

fun fill(dest: Array<in Int>, value: Int) {
    dest[0] = value
}

fun printArray(array: Array<*>) {
    array.forEach { println(it) }
}