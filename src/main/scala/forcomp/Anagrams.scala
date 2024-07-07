package forcomp

object Anagrams extends AnagramsInterface {

  type Word = String

  type Sentence = List[Word]

  type Occurrences = List[(Char, Int)]

  val dictionary: List[Word] = Dictionary.loadDictionary

  def wordOccurrences(w: Word): Occurrences = {
    for (x <- w.toLowerCase.toList.groupBy((c: Char) => c).toList.sortBy(_._1)) yield (x._1, x._2.length)
  }

  def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString)

  object Dictionary {
    def loadDictionary: List[String] = {
      val wordstream = Option {
        getClass.getResourceAsStream(List("forcomp", "linuxwords.txt").mkString("/", "/", ""))
      } getOrElse {
        sys.error("Could not load word list, dictionary file not found")
      }
      try {
        val s = scala.io.Source.fromInputStream(wordstream)
        s.getLines.toList
      } catch {
        case e: Exception =>
          println("Could not load word list: " + e)
          throw e
      } finally {
        wordstream.close()
      }
    }
  }

}
