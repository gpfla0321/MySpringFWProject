package workshop.account.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String errMessage) {
		// 부모의 생성자 호출
		super(errMessage);
	}
}
