/*
 Replace each letter with the letter that is in the corresponding position from the end of the English alphabet:
 a→z, b→y, c→x, ... x→c, y →b, z→a.
 Do not replace spaces or exclamation marks.
 Use the given template to your program to print the ciphertext instead of the original message,
 no program input is required.
 The output should look like ## ##### # ########! where # is a lower-case English letter.
*/

package encryptdecrypt

fun main() {
    val strA = 'a'
    val strZ = 'z'
    val asciiA = strA.code
    val asciiZ = strZ.code

    val message = "we found a treasure!"

    for (char in message) {
        if (char.lowercaseChar().code in asciiA..asciiZ) {
            print((asciiZ - char.code + asciiA).toChar())
        } else {
            print(char)
        }
    }
}
