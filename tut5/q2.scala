object q2 {

    def main(args: Array[String]) = {
        primeSeq(19);
    }

    def gcd(m:Int,n:Int):Int=n match{
        case 0 => m;
        case x if(x>m) => gcd(x,m);
        case x => gcd(x,m%x);
    }

    def prime(a:Int,b:Int=2):Boolean=b match{
        case x if(x==a) => true;
        case x if gcd(a,x)>1 => false;
        case x => prime(a,x+1);
    }

    def primeSeq(n:Int):Unit={
        for(i <- 2 to n){
            if (prime(i)==true) println(i)
        }
    }

}
