package nested;

//1 ) implements 모든 추상 메소드

/*

public class AbstractMain implements InterA {

	public void aa() {}
	public void bb() {}
	
	public static void main(String[] args) {

	}

}

*/

//2) 대신할 인터페이스
//public class AbsractMain {
//	
//	public static void main(String[] args) {
//		InterA in = new InterAImpl();
//		in.aa();
//	}
//	
//}

//3)
public class AbstractMain{
	public static void main(String[] args) {
		InterA in = new InterA() { //가로만 쳐져있는 익명 이너 클래스(클래스안에 클래스)
			public void aa() {};
			public void bb() {};
			
		}; // 한 문장으로 끝나는 거니까 세미콜론 빼먹으면 안됨
//		AbstractTest at = new AbstractTest(); - 추상추상 x
//		생성하려고 1. 자식 클래스
//				2. 익명 Inner Class 사용
		
		AbstractTest at = new AbstractTest(){
			public void setName(String name) { 
				this.name = name;
			}
		};
		
		AbstractExam ae = new AbstractExam() {};
		
	}
}	

