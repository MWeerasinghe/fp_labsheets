import scala.io.StdIn

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val inp =StdIn.readInt();
    print(matching(inp))
  }

  def matching(numb:Int):String=numb match{
    case x if x<=0 => "Negative/Zero"
    case x if x%2==1 => "Odd"
    case _ => "Even"
  }

}