package ExceptionHandling;

public class UserMakeException extends Exception{
    private static final long serialVersionUID = 1L;
    public UserMakeException() {
        super("\n번호 선택하세요. 1~3 입니다.");
    }
}
