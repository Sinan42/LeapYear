import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the year:");
        int year= input.nextInt();
        if(0<year){
            if(isLeapYear(year)){
                System.out.println("leap year");
            }else{
                System.out.println("it is not a leap year");
            }
        }else{
            System.out.println("wrong value");
        }

    }
    public static boolean isLeapYear(int year) {
        if(year % 4 != 0)
            return false;

        if(year % 100 == 0 && year % 400 != 0)
            return false;

        return true;
    }
}
