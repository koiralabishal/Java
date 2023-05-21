import java.util.Scanner;

public class Salary {
   
    public static void main(String str[]){
    int hours;
    double rate;
    double salary;
    System.out.println("Enter no. of hours that the employees worked and their base paye rate ");
    Scanner sc = new Scanner(System.in);
    hours=sc.nextInt();
    rate= sc.nextDouble();
    sc.close();
    salary= rate*hours;
    System.out.println("Salary is: Rs."+salary+"/-");
    if (rate<12.5) {
        System.err.println("This employee not getting legally required minimum wage.");
    }
    if (hours>7*24) {
        System.err.println("Did this employee really works "+ hours+" hrs.");
    }
    }
}
