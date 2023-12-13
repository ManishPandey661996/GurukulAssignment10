
import java.util.Scanner;
class Fibnocci{
    private int lowerLimit , upperLimit ;

    public Fibnocci(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the lower limit : ");
        lowerLimit = sc.nextInt();
        System.out.println(" enter the upper limit : ");
        upperLimit = sc.nextInt();
        int a = 0 ,b = 1;
         while (a<= upperLimit ){
            if(a>= lowerLimit ){
                System.out.print(a +" ");
            }
            int c = a+b;
            a=b;
            b=c;
        }

        
      
    }

   
}

class FibnocciTest{
    public static void main(String[] args){
        Fibnocci f1 = new Fibnocci();

    }
}

