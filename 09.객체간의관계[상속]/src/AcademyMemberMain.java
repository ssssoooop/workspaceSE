
public class AcademyMemberMain {

	public static void main(String[] args) {
		/*****************존재하지않는 객체생성***********
		AcademyMember academyMember=new AcademyMember(0,"누구게");
		academyMember.print();
		*************************************************/
		System.out.println();
		
		AcademyStudent st1=new AcademyStudent(1,"KIM","LINUX");	
		AcademyStudent st2=new AcademyStudent(2, "KANG","JAVA");
		
		AcademyGangsa gs1=new AcademyGangsa(3, "BOGUS","자바");
		AcademyGangsa gs2=new AcademyGangsa(4, "HONG","오피스");
		
		AcademyStaff sf1=new AcademyStaff(5,"LEE", "영업팀");
		AcademyStaff sf2=new AcademyStaff(5,"LEE", "취업팀");
		
		
		System.out.println("-------------Student---------------");
		/******호출되면안되는 메쏘드호출************
		st1.print();
		****************************/
		st1.studentPrint();
		st2.studentPrint();
		System.out.println("-------------Gangsa-----------------");
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		System.out.println("-------------Staff--------------");
		sf1.staffPrint();
		sf2.staffPrint();
		
	}

}
