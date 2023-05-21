import java.util.*;
class BankAccount {
    String name,id;
    int balance, amount;
    Scanner sc = new Scanner(System.in);
    public void getValue()
    {
        System.out.println("Enter name, id and balance of a person");
        name= sc.next();
        id = sc.next();
        balance=sc.nextInt();
    }
    public void deposit()
    {
        System.out.println("\nEnter deposit amount");
        amount= sc.nextInt();
        balance = balance+amount;
        System.out.println("\nHello, "+name+" you have deposited NPR "+amount+" successfully.");
       

    }
    public void withdraw()
    {
        System.out.println("\nEnter withdrawl amount");
        amount= sc.nextInt();
        balance= balance-amount;
        System.out.println("\nHello, "+name+" , you have withdrawn NPR " +amount+" successfully.");

    }
    public void getAccountDetail()
    {
        System.out.println("\nAccount Detail is:");
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Balance "+balance);
    }
    public static void main(String str[])
    {
        BankAccount b=new BankAccount();
        b.getValue();
        b.deposit();
        b.getAccountDetail();
        b.withdraw();
        b.getAccountDetail();
    }
}
