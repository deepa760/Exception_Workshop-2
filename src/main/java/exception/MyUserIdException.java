package exception;

public class MyUserIdException extends Exception {
    private String msg;

    public MyUserIdException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}