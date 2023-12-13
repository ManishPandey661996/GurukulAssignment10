import java.util.Scanner;
class TimeUsingConstructor{
    private int hour , minute  ;

    public TimeUsingConstructor(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter hour in 24 hr format : ");
        hour = sc.nextInt();
        System.out.println(" Enter minutes  : ");
        minute = sc.nextInt();
    }

    public TimeUsingConstructor(TimeUsingConstructor t1 , TimeUsingConstructor t2){
        
        
        int differenceInHours = t1.getHour() - t2.getHour();
        int differenceInMinutes = t1.getMinute() - t2.getMinute();

        int difference = (differenceInHours * 60) + differenceInMinutes;
        hour = difference /60 ;
        minute = difference % 60;

        
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

   
    public String toString() {
        return String.format("%d hour: %02d minutes",hour,minute);
    }
    

}

class TimeUsingConstructorTest{
    public static void main(String[] args){
        TimeUsingConstructor t3 = new TimeUsingConstructor();
        TimeUsingConstructor t4 = new TimeUsingConstructor();
        TimeUsingConstructor t5 = new TimeUsingConstructor(t3,t4);
        System.out.println(t5.toString());
        

    }
}