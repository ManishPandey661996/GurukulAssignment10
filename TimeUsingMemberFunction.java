import java.util.Scanner;
class TimeUsingMemberFunction{
    private int hour , minute  ;

    public TimeUsingMemberFunction(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter hour in 24 hr format : ");
        hour = sc.nextInt();
        System.out.println(" Enter minutes  : ");
        minute = sc.nextInt();
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    static void duration(TimeUsingMemberFunction t1 , TimeUsingMemberFunction t2){
        int differenceInHours = t1.getHour() - t2.getHour();
        int differenceInMinutes = t1.getMinute() - t2.getMinute();

         int difference = (differenceInHours * 60) + differenceInMinutes;
        int hours = difference /60 ;
        int minutes = difference % 60;

        System.out.printf("%d hour: %02d minutes",hours,minutes);

    }

    

}

class TimeUsingMemberFunctionTest{
    public static void main(String[] args){
        TimeUsingMemberFunction t3 = new TimeUsingMemberFunction();
        TimeUsingMemberFunction t4 = new TimeUsingMemberFunction();
        TimeUsingMemberFunction.duration(t3,t4);
        

    }
}