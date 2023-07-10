object q4{

    def main(args: Array[String]) = {
        println(isEven(19));
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
}   
