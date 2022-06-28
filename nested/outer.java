package nested;

public class outer {

	private String name;

	public void output() {
		Inner in = new Inner();
		System.out.println("이름"  + this.name + "\t나이 : " + in.age);
	}
	
	class Inner { //메서드를 대신할 수 있어서 편함.
		private int age;
		
		public void disp() {
			System.out.println("이름"  + outer.this.name + "\t나이 : " + this.age);
		}
	} // class Inner
	
	public static void main(String[] args) {
			outer ou = new outer();
			ou.name = "홍길동";
			System.out.println("이름 = " + ou.name);
			
			outer.Inner oi2 = ou.new Inner();
			oi2.age = 25;
			oi2.disp();
			System.out.println("이름 : " + ou.name + "나이");
			
			outer.Inner oi3 = ou.new Inner();
			oi3.age = 25;
			oi3.disp(); 
			System.out.println("이름 : " + ou.name + "나이");
			
			outer.Inner in4 = new outer().new Inner();
			in4.age=35;
			in4.disp();
			
	} 
}