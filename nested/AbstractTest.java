package nested;

public abstract class AbstractTest {//POJO

	String name;

	public String getName() {
		return name;
	}
	public abstract void setName(String name); //추상메소드
	//원하는거 골라서 쓰라는 말임 == 메소드 안에 구현부가 없다
}
