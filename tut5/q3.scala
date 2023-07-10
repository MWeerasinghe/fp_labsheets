object q3{

    def main(args: Array[String]) = {
        println(sum(5));
    }

    def sum(n:Int):Int=n match{
        case x if(x==0) => 0
        case x if(x>0) => x+sum(x-1);
    }

}
