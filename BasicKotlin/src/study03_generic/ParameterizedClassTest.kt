package study03_generic

import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertTrue


class ParameterizedClassTest {
    @Test
    fun `isStringParameterizedClass`() {
        assertTrue(res is String)
    }

    @Test
    fun `isAnyParameterizedProducer`() {
        val ref: ParameterizedProducer<Any> = parameterizedProducer
        assertTrue(ref is ParameterizedProducer<Any>)
    }

    @Test
    fun `isDoubleParameterizedProducer`() {
        val ref: ParameterizedConsumer<Double> = parameterizedConsumer
        assertTrue(ref is ParameterizedConsumer<Double>)
    }

    @Test
    fun `copyIntToAny`() {
        copy(ints, any)

        assertEquals(any[0], 1)
        assertEquals(any[1], 2)
        assertEquals(any[2], 3)
    }
}