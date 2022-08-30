package JavaBase.day08.ExceptionTest.ExceptionCase;

/**
 * 年龄超出限制异常
 *
 * @author qilin
 */
public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
