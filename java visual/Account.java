import java.util.Scanner;
public class Account {
    int acc_no;
    int balance;

    Scanner sc=new Scanner(System.in);

    public Account(int acc_no,int balance){
        this.acc_no=acc_no;
        this.balance=balance;
    }

    public void deposit(){
        int amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt=sc.nextInt();
        balance=amt+balance;
    }

    public void withdraw(){
        int amt;
        System.out.println("Enter amount you want to withdraw: ");
        amt=sc.nextInt();
        if(amt>balance){
            System.out.println("Not enough balance");
        }
        else{
            balance=balance-amt;
            System.out.println("Balance after withdrawl: "+balance);
        }
    }

    public void moneyTransfer(Account ac1){
        int amt;
        System.out.println("Enter amount to transfer");
        amt=sc.nextInt();
        // int acc_no1=sc.nextInt();
        // System.out.println("Enter the account no:");
        // acc_no=ac1.acc_no;
        if(amt>balance){
            System.out.println("Not enough money to transfer");
        }
        else{
            balance=balance-amt;
            ac1.balance=ac1.balance+amt;
            System.out.println("Money has been transfered successfully");
            System.out.println("Your current balance is: "+balance);
        }
    }


    public static void main(String[] args) {

        Account ac=new Account(101, 500);
        // System.out.println(ac.balance);
        // ac.withdraw();
        // ac.deposit();
        // System.out.println(ac.balance);
        Account ac1=new Account(102, 1000);
        ac.moneyTransfer(ac1);
        System.out.println(ac1.balance);
        
        
    }
}


// class Operation
// {
//     int accountNumber;
//     double balance;
//     Operation(int num,double initialBal)
//     {
//         accountNumber=num;
//         balance=initialBal;
//     }
//     public void deposit(double amount)
//     {
//         balance=balance+amount;
//     }
//     public void withdraw(double amount)
//     {
//         balance=balance-amount;
//     }
//     public double getBalance()
// 	{
// 		return balance;
// 	}
//     public void transferFunds(Operation destination,double amount)
//     {
//         destination.deposit(amount);
//         this.withdraw(amount);
//     }
// }
// class Account{
// public static void main(String[] args)
//     {
//         Operation o1=new Operation(111,10000);
//         Operation o2=new Operation(222,20000);
//         o1.deposit(40000);
//         o1.withdraw(5000);
//         o1.transferFunds(o2,10000);
//         System.out.println(o1.getBalance());
//         System.out.println(o2.getBalance());
//     }
// }