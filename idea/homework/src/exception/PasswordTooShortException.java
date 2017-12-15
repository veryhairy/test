package exception;

public class PasswordTooShortException extends RegisterException {
    @Override
    public String getMessage() {
        return "密码太短了";
    }
}
