/*
* You're receiving an encrypted text, and now you are going to decrypt the text.
* The encryption is done through decreasing the every character by two, like
* love --> nqxg
*
* Also think of it that the decryption of A is Y and a is y.
* */

fun main() {
    val decryptedText = decryptionText("cdeb nqxg!", "love")
    println(decryptedText)
}

fun decryptionText(encryptedText: String, knownWord: String): String {
    val result = StringBuilder()
    val splitSentence = encryptedText.split(" ")
    var knownFlag = false

    for (word in splitSentence) {
        val decrypt = word.map { char ->
            when (char) {
                in 'a'..'z' -> if (char == 'a') 'y' else if (char == 'b') 'z' else char - 2
                in 'A'..'Z' -> if (char == 'A') 'Y' else if (char == 'B') 'Z' else char - 2
                else -> char // Non-alphabetic characters remain unchanged
            }.toChar()
        }.joinToString("")
        result.append(decrypt).append(" ")
        if (decrypt.filter { it.isLetter() } == knownWord) knownFlag = true
    }

    return if (knownFlag) result.toString().trim() else "Invalid"
}