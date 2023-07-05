import scala.io.StdIn

object hello {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",toLower))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",toUpper))
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String,format:String=>String): String = {
    format(name)
  }

}