object q5{

    def main(args: Array[String]) = {
        f1(19);
    }

    def isEven(number: Int): Boolean = {
         if (number == 0) {
             true 
        } else if (number == 1) {
            false 
        } else {
            isEven(number - 2) 
        }
    }

    def f1(n:Int):Unit={
        for (i <- 1 to n){
            if(isEven(i)) println(i)

        }
    }
}   
