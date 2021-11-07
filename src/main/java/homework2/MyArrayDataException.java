package homework2;

public class MyArrayDataException extends RuntimeException {

    private static final String MESSAGE = "Неверный формат в строке %d и слобце %d";

    public MyArrayDataException(int i, int j) {
        super(String.format(MESSAGE, i, j));
    }

    public MyArrayDataException(int i, int j, Throwable cause) {
        super(String.format(MESSAGE, i, j), cause);
    }
}
