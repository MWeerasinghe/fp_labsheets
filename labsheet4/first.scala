import scala.io.StdIn

object HelloWorld {
  def main(args: Array[String]): Unit = {
    print(matching(200));
  }

  def matching(amount:Double):Double=amount match{
    case x if x<=20000 => amount*102/100
    case x if x<=200000 => amount*104/100
    case x if x<=2000000 => amount*103.5/100
    case x if x>200000 => amount*106.5/100 
  }

}