
import java.util.Scanner;
class FruitJuice{
    private int productCode;
    private String flavor;
    private String packType;
    private int packSize;
    private int productPrice;

    public FruitJuice(){
        productCode =0;
        flavor = "\"\"";
        packType = "\"\"";
        packSize = 0;
        productPrice = 0;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code : ");
        productCode = sc.nextInt();
        System.out.println("Enter the flavour : ");
        flavor = sc.next();
        System.out.println("Enter the pack type : ");
        packType = sc.next();
        System.out.println("Enter the pack size in ml : ");
        packSize = sc.nextInt();
        System.out.println("Enter the product price : ");
        productPrice = sc.nextInt();

    }

    public void discount(){
        productPrice = productPrice - 10 ;
    }

    public void display(){
        System.out.println(" product code : "+ productCode);
        System.out.println(" flavor : "+ flavor);
        System.out.println(" pack type : "+ packType);
        System.out.println(" pack size : "+ packSize +" ml");
        System.out.println(" product price : "+ productPrice);

    }


}

class FruitJuiceTest{
    public static void main(String[] args){
        FruitJuice f = new FruitJuice();
        f.input();
        f.discount();
        f.display();
    }
}