package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = {
    val alphabetic = (('a' to 'z') ++ ('A' to 'Z'))
    val newStr = s.filter(alphabetic.contains(_)).map(_.toLower)
    val reverseStr = newStr.reverse
    newStr == reverseStr
}

}