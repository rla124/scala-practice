package forcomp

trait AnagramsInterface {
  def wordOccurrences(w: String): List[(Char, Int)]

  def sentenceOccurrences(s: List[String]): List[(Char, Int)]
}
