package generic;
import java.util.ArrayList;

import nogeneric.Account;
public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111,"BING",320000,0.5);
		Account acc2=new Account(2222,"MING",12000,0.1);
		Account acc3=new Account(3333,"KING",89000,0.3);
		Account acc4=new Account(4444,"YUNG",45000,0.2);
		Account acc5=new Account(5555,"SANG",99000,0.6);
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		System.out.println("# list size:"+accountList.size());
		System.out.println("--------1.add(element)------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------2.add(index,element)-----");
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------3.set(index,element)-----");
		accountList.set(0, new Account(1000,"MEN",52000,1.1));
		System.out.println(accountList);
		System.out.println("---------4.get(index)------");
		Account getAccount= accountList.get(0);
		getAccount.print();
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("---------5.remove(index)-------");
		Account removeAccount=accountList.remove(0);
		removeAccount.print();
		System.out.println("# list size:"+accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%업무실행%%%%%%%%%%");
		System.out.println("*********1.계좌전체출력*********");
		
		for (int i = 0; i < args.length; i++) {
			accountList.get(i).print();
		}
		System.out.println();
		Account.headerPrint();
		for (Account account : accountList) {
			account.print();
		}
		
		System.out.println("*********2.계좌번호 3333번계좌찾기******");
		for (Account account : accountList) {
			if(account.getNo()==3333) {
				account.print();
				break;
			}
		}
		System.out.println("*********3.계좌주이름을 KIM;계좌 여러개찾기*******");
		for (Account account : accountList) {
			if(account.getOwner().equals("KIM")) {
				account.print();
			}
		}
		System.out.println("*********4.계좌번호 4444번 계좌1개삭제*******");
		/*
		for (int j = 0; j <accountList.size(); j++) {
			Account account=accountList.get(i);
			if(account.getNo()==4444) {
				accountList.remove(i);
				break;
			}
		}
		*/
		for (int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getOwner().equals("KING")) {
				accountList.remove(i).print();
				i--;
			}
		}
		System.out.println("*********1.계좌전체출력*********");
				
				for (int i = 0; i < args.length; i++) {
					accountList.get(i).print();
				}
	}

}
