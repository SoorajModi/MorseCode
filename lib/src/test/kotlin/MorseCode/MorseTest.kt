package MorseCode

import kotlin.test.Test
import kotlin.test.assertEquals

class MorseTest {
    private val morse = Morse()

    @Test
    fun testConvertToMorse() {
        assertEquals("invalid", morse.convertToMorse("invalid"), "should return empty string if invalid key")

        assertEquals("/", morse.convertToMorse(" "), "should convert space to morse code equivalent")

        assertEquals(".-", morse.convertToMorse("A"), "should convert A to morse code equivalent")
        assertEquals("-...", morse.convertToMorse("B"), "should convert B to morse code equivalent")
        assertEquals("-.-.", morse.convertToMorse("C"), "should convert C to morse code equivalent")
        assertEquals("-..", morse.convertToMorse("D"), "should convert D to morse code equivalent")
        assertEquals(".", morse.convertToMorse("E"), "should convert E to morse code equivalent")
        assertEquals("..-.", morse.convertToMorse("F"), "should convert F to morse code equivalent")
        assertEquals("--.", morse.convertToMorse("G"), "should convert G to morse code equivalent")
        assertEquals("....", morse.convertToMorse("H"), "should convert H to morse code equivalent")
        assertEquals("..", morse.convertToMorse("I"), "should convert I to morse code equivalent")
        assertEquals(".---", morse.convertToMorse("J"), "should convert J to morse code equivalent")
        assertEquals("-.-", morse.convertToMorse("K"), "should convert K to morse code equivalent")
        assertEquals(".-..", morse.convertToMorse("L"), "should convert L to morse code equivalent")
        assertEquals("--", morse.convertToMorse("M"), "should convert M to morse code equivalent")
        assertEquals("-.", morse.convertToMorse("N"), "should convert N to morse code equivalent")
        assertEquals("---", morse.convertToMorse("O"), "should convert O to morse code equivalent")
        assertEquals(".--.", morse.convertToMorse("P"), "should convert P to morse code equivalent")
        assertEquals("--.-", morse.convertToMorse("Q"), "should convert Q to morse code equivalent")
        assertEquals(".-.", morse.convertToMorse("R"), "should convert R to morse code equivalent")
        assertEquals("...", morse.convertToMorse("S"), "should convert S to morse code equivalent")
        assertEquals("-", morse.convertToMorse("T"), "should convert T to morse code equivalent")
        assertEquals("..-", morse.convertToMorse("U"), "should convert U to morse code equivalent")
        assertEquals("...-", morse.convertToMorse("V"), "should convert V to morse code equivalent")
        assertEquals(".--", morse.convertToMorse("W"), "should convert W to morse code equivalent")
        assertEquals("-..-", morse.convertToMorse("X"), "should convert X to morse code equivalent")
        assertEquals("-.--", morse.convertToMorse("Y"), "should convert Y to morse code equivalent")
        assertEquals("--..", morse.convertToMorse("Z"), "should convert Z to morse code equivalent")

        assertEquals(".----", morse.convertToMorse("1"), "should convert 1 to morse code equivalent")
        assertEquals("..---", morse.convertToMorse("2"), "should convert 2 to morse code equivalent")
        assertEquals("...--", morse.convertToMorse("3"), "should convert 3 to morse code equivalent")
        assertEquals("....-", morse.convertToMorse("4"), "should convert 4 to morse code equivalent")
        assertEquals(".....", morse.convertToMorse("5"), "should convert 5 to morse code equivalent")
        assertEquals("-....", morse.convertToMorse("6"), "should convert 6 to morse code equivalent")
        assertEquals("--...", morse.convertToMorse("7"), "should convert 7 to morse code equivalent")
        assertEquals("---..", morse.convertToMorse("8"), "should convert 8 to morse code equivalent")
        assertEquals("----.", morse.convertToMorse("9"), "should convert 9 to morse code equivalent")
        assertEquals("-----", morse.convertToMorse("0"), "should convert 0 to morse code equivalent")

        assertEquals(".-.-.-", morse.convertToMorse("."), "should convert . to morse code equivalent")
        assertEquals("--..--", morse.convertToMorse(","), "should convert , to morse code equivalent")
        assertEquals("..--..", morse.convertToMorse("?"), "should convert ? to morse code equivalent")
    }
}

