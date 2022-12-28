package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import impl.CRUD;
import pojo.Account;

public class CRUDDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CRUD crud=new CRUD();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		do {
			System.out.println("Operations on Account");
			System.out.println("1: insert, 2; update  3: delete  4: search 5: select all 6:Operations 7: exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:
				System.out.println("Enter Account details:");
				System.out.println("Enter Account Number");
				int accountNo=Integer.parseInt(br.readLine());	
				System.out.println("Enter Customer Id");
				int custId=Integer.parseInt(br.readLine());	
				System.out.println("Enter Account Type");
				String accType=br.readLine();	
				System.out.println("Enter balance");
				double balance=Double.parseDouble(br.readLine());		
				Account acc=new Account(accountNo,custId,accType,balance);
				// emp : Data carrier (pojo)		
				boolean b=crud.addAccount(acc);
				if(b)
					System.out.println("Account added.....");
				else
					System.out.println("Failed......");
				break;
			case 2:
				System.out.println("Update Account details:");
				System.out.println("Enter existing Account no to update details");
				 accountNo=Integer.parseInt(br.readLine());			
				 Account searchedAcc=crud.getAccountById(accountNo);
				 System.out.println("Searched :"+searchedAcc);
				 System.out.println("What u want to update");
				 System.out.println("1:balance 2: Account Type 3: both 4: back");
				 int choice=Integer.parseInt(br.readLine());
				 switch (choice) {
				case 1:			
					System.out.println("Enter new balance");
					balance=br.read();
					searchedAcc.setBalance(balance);
					break;
				case 2:
					   System.out.println("Enter new Account Type");
					   accType=br.readLine();			
		              searchedAcc.setAccType(accType);
					break;
				case 3:
					System.out.println("Enter new balance");
					balance=br.read();
					 System.out.println("Enter new Account Type");
					   accType=br.readLine();		
					   searchedAcc.setBalance(balance);
					   searchedAcc.setAccType(accType);
					break;
				case 4:
					break;
				default:System.out.println("Wrong choice");
					break;
				}
				if(choice==1 || choice==2 || choice==3)
				{
					b=crud.updateAccount(searchedAcc);
					if(b)
						System.out.println("Account updated........");
					else
						System.out.println("Failed............");
				}
				break;
			case 3:
				System.out.println("Enter existing Account Number to delete Account");
				 accountNo=Integer.parseInt(br.readLine());
				 b= crud.deleteAccount(accountNo);
				 if(b)
						System.out.println("Account deleted........");
					else
						System.out.println("Failed............");
				 break;
			case 4:
				System.out.println("Enter existing Account Number to search Account");
				 accountNo=Integer.parseInt(br.readLine());
				 searchedAcc= crud.getAccountById(accountNo);
				if(searchedAcc!=null)
						System.out.println(searchedAcc);
				else
					System.out.println("Account not found");
				break;
			case 5:
				List<Account> eList=crud.getAllAccounts();
				//method reference
				System.out.println(eList.size());
				if(eList.isEmpty())
					System.out.println("No Records to display....");
				eList.forEach(System.out::println);
				break;
			case 6:
				
			break;
			case 7:
				break;
			 default: System.out.println("Wrong choice");
			}
		}while(ch!=6);

	}
}