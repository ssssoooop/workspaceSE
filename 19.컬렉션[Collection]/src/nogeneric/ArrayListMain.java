package nogeneric;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		Account acc1=new Account(1111,"BING",320000,0.5);
		Account acc2=new Account(2222,"MING",12000,0.1);
		Account acc3=new Account(3333,"KING",89000,0.3);
		Account acc4=new Account(4444,"YUNG",45000,0.2);
		Account acc5=new Account(5555,"SANG",99000,0.6);
		
		ArrayList accountList = new ArrayList();
		int size=accountList.size();
		System.out.println("#size:"+size);
		System.out.println("**************** 1.add[맨마지막 index에객체저장]******");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 2.add[지정된 index에객체저장]*******");
		accountList.add(new Account(3332,"THREE",33000,3.3));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 3.set(index,element)[지정된 index에객체저장]*******");
		accountList.set(5, new Account(9999, "LAST",88888, 8.8));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("***********4.get(index)*****************************************");
		Account getAccount=(Account)accountList.get(1);
		System.out.println(getAccount);
		System.out.println("***********5.remove(index)**************************************");
		Account removeAccount = (Account)accountList.remove(accountList.size()-1);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%");
		System.out.println("############1.계좌전체출력#############");
		Account.headerPrint();
		for (int i = 0; i < args.length; i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
		}
		Account.headerPrint();
		for(Object objectAccount:accountList) {
			/*Account tempAccount = (Account)account;
			tempAccount.print();
			*/
			((Account)objectAccount).print();
		
		}
		System.out.println("************2.계좌번호3333번 한개찾기**********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("************3.계좌이름번호 KING인 계좌 여러개찾기**********");
		for (int i = 0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				((Account)accountList.get(i)).print();
			}
		}
		System.out.println("************4.계좌번호 4444번 계좌한개삭제**********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==4444) {
				accountList.remove(i);
				System.out.println(">> remove전 size:"+accountList.size());
				Account rAccount=(Account)accountList.remove(i);
				rAccount.print();
				System.out.println(">> remove후 size:"+accountList.size());
				break;
			}
		}
		System.out.println("************5.계좌번호 KING인 계좌 계좌한개삭제[QUIZ]**********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
			}
		}
		System.out.println(accountList);
		
	}

}
