package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
	
	private int dan;
	
	public void input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("원하는 단을 입력 하세요 : ");
		int dan = Integer.parseInt(br.readLine());
		
	
	}
	
	public void output() {
		
		for(int i=1; i<10; i++) {
			if (dan>=2 && dan<=9) {System.out.println(dan +"*" + i+ "=" + dan*i);
			}	
//			else System.out.println("범위 초과");
				else {
					try {
						
	//			개발자가 강제로 Exception 발생하게 하기
						throw new Exception("범위 초과");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
				
		}
	}
	public static void main(String[] args) throws IOException{	
		ExceptionMain2 em = new ExceptionMain2();
		em.input(); // 구현부와 호출부를 throws 같이 불러줘야함.
		
		
		em.output();
		
//		catch(NumberFormatException e) {
//			System.out.println("숫자 형식만 입력하세요. ");
//		}
	}
}


/*
원하는 단을 입력 : 7 input() => Buffered Reader, throws 사용 (input)
범위초과
(output)
7*1=7
.
.
7*9=63
*/