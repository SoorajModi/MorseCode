package MorseCode

import kotlin.test.Test
import kotlin.test.assertEquals

class AlphabetTest {
    private val alpha = Alphabet()

    @Test
    fun testConvertMorseToAlphabet() {
        assertEquals("invalid", alpha.convertToAlphabet("invalid"), "should return empty string if invalid key")

        assertEquals(" ", alpha.convertToAlphabet("/"), "should return empty space")

        assertEquals("A", alpha.convertToAlphabet(".-"), "should return A")
        assertEquals("B", alpha.convertToAlphabet("-..."), "should return B")
        assertEquals("C", alpha.convertToAlphabet("-.-."), "should return C")
        assertEquals("D", alpha.convertToAlphabet("-.."), "should return D")
        assertEquals("E", alpha.convertToAlphabet("."), "should return E")
        assertEquals("F", alpha.convertToAlphabet("..-."), "should return F")
        assertEquals("G", alpha.convertToAlphabet("--."), "should return G")
        assertEquals("H", alpha.convertToAlphabet("...."), "should return H")
        assertEquals("I", alpha.convertToAlphabet(".."), "should return I")
        assertEquals("J", alpha.convertToAlphabet(".---"), "should return J")
        assertEquals("K", alpha.convertToAlphabet("-.-"), "should return K")
        assertEquals("L", alpha.convertToAlphabet(".-.."), "should return L")
        assertEquals("M", alpha.convertToAlphabet("--"), "should return M")
        assertEquals("N", alpha.convertToAlphabet("-."), "should return N")
        assertEquals("O", alpha.convertToAlphabet("---"), "should return O")
        assertEquals("P", alpha.convertToAlphabet(".--."), "should return P")
        assertEquals("Q", alpha.convertToAlphabet("--.-"), "should return Q")
        assertEquals("R", alpha.convertToAlphabet(".-."), "should return R")
        assertEquals("S", alpha.convertToAlphabet("..."), "should return S")
        assertEquals("T", alpha.convertToAlphabet("-"), "should return T")
        assertEquals("U", alpha.convertToAlphabet("..-"), "should return U")
        assertEquals("V", alpha.convertToAlphabet("...-"), "should return V")
        assertEquals("W", alpha.convertToAlphabet(".--"), "should return W")
        assertEquals("X", alpha.convertToAlphabet("-..-"), "should return X")
        assertEquals("Y", alpha.convertToAlphabet("-.--"), "should return Y")
        assertEquals("Z", alpha.convertToAlphabet("--.."), "should return Z")

        assertEquals("1", alpha.convertToAlphabet(".----"), "should return 1")
        assertEquals("2", alpha.convertToAlphabet("..---"), "should return 2")
        assertEquals("3", alpha.convertToAlphabet("...--"), "should return 3")
        assertEquals("4", alpha.convertToAlphabet("....-"), "should return 4")
        assertEquals("5", alpha.convertToAlphabet("....."), "should return 5")
        assertEquals("6", alpha.convertToAlphabet("-...."), "should return 6")
        assertEquals("7", alpha.convertToAlphabet("--..."), "should return 7")
        assertEquals("8", alpha.convertToAlphabet("---.."), "should return 8")
        assertEquals("9", alpha.convertToAlphabet("----."), "should return 9")
        assertEquals("0", alpha.convertToAlphabet("-----"), "should return 0")

        assertEquals(".", alpha.convertToAlphabet(".-.-.-"), "should return .")
        assertEquals(",", alpha.convertToAlphabet("--..--"), "should return ,")
        assertEquals("?", alpha.convertToAlphabet("..--.."), "should return ?")
    }
}
