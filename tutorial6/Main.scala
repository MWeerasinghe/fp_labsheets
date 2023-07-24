object Main {
  def main(args: Array[String]) = {
    println(encryption("hello", 1))
  }

  def encryption(str: String, no_shift: Int): String = {
    var word = ""
    for (letter <- str) {
      var shiftedChar = (letter.toInt + no_shift).toChar
      if (letter.isUpper) {
        if (shiftedChar > 'Z') {
          shiftedChar = (shiftedChar.toInt - 26).toChar
        }
      } else if (letter.isLower) {
        if (shiftedChar > 'z') {
          shiftedChar = (shiftedChar.toInt - 26).toChar
        }
      }
      word += shiftedChar
    }
    return word
  }

  def decryption(str: String, no_shift: Int): String = {
    var word = ""
    for (letter <- str) {
      var shiftedChar = (letter.toInt - no_shift).toChar
      if (letter.isUpper) {
        if (shiftedChar > 'Z') {
          shiftedChar = (shiftedChar.toInt - 26).toChar
        }
      } else if (letter.isLower) {
        if (shiftedChar > 'z') {
          shiftedChar = (shiftedChar.toInt - 26).toChar
        }
      }
      word += shiftedChar
    }
    return word
  }
}
