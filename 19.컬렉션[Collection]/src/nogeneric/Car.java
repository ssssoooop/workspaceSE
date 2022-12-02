package nogeneric;

public class Car {
	/*
	 * 차량의 전체생산대수를 저장할 static(공용)변수
	 */
	public static int count=0;
	
	private int no;		//차량번호
	private String model;//모델명
	private String color;//차색상
	public Car() {
		
	}
	public Car(String model,int no) {
		super();
		this.no = no;
		this.color = color;
	}
	public Car(int no,String model,String color) {
		this.no=no;
		this.model=model;
		this.color=color;
		Car.count=Car.count+1;
	}
	public static void headerPrint() {
		System.out.println("---------------------");
		System.out.println("번호 \t 모델 \t 색상");
		System.out.println("--------------------");
	}
	public void print() {
		System.out.println(no+"\t"+model+"\t"+color);
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
