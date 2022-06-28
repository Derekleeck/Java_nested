package exception;

public class MakeException extends Exception { //개발자가 만든 exception 클래스
	private String errorMsg;
	
	public MakeException() {}

	public MakeException(String erroMsg) {
		this.errorMsg = erroMsg;
	}
	public String toString() {
		return errorMsg;
	}
	
}

