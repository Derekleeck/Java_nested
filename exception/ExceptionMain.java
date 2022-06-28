package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {

	public static void main(String[] args) throws IOException{
		if(args.length>=1) System.out.println("args[0] = " + args[0]);
		//if 조건문으로 에러 막음
		System.out.println();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("정수를 입력하세요 : ");
//			int data = br.read(); //1개 문자
			int str = Integer.parseInt(br.readLine()); 
			
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			
			
			System.out.println(a + "/ " + b + " = " + a/b);
			
		}catch(IOException e) {
			e.printStackTrace();//오류난 부분 출력
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식만 입력하세요. ");  //오류난 부분 사용자에게 알려주기
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다."); //에러를 막은건 아님
		}finally {//db에서 많이 사용함.
			System.out.println("error가 있건 없건 무조건 실행");
		}
		
	}

}
