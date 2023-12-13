// poc - taking two variables in each object and swaping the values .
import java.util.Scanner;
class SwapContentOfTwoObjects{
    int x ;
    int y;

    public SwapContentOfTwoObjects(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x= sc.nextInt();
        System.out.println("Enter the value of y : ");
        y= sc.nextInt();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int p){
        x = p;
    }

    public void setY(int r){
        y = r;
    }

    

    static  void swap(SwapContentOfTwoObjects c1 , SwapContentOfTwoObjects c2){
        int n , b ;
        n= c1.getX();
        b= c1.getY();
        c1.setX(c2.getX());
        c1.setY(c2.getY());
        c2.setX(n);
        c2.setY(b);
    }

    public void display(){
        System.out.println(x + "  " + y);
    }


}

class SwapContentOfTwoObjectsTest{
    public static void main(String[] args){
        SwapContentOfTwoObjects s1 = new SwapContentOfTwoObjects();
        SwapContentOfTwoObjects s2 = new SwapContentOfTwoObjects();
        System.out.println("value before swapping :");
        s1.display();
        s2.display();
        SwapContentOfTwoObjects.swap(s1,s2);
        System.out.println("value before swapping :");
        s1.display();
        s2.display();




    }
}