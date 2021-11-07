package homework2;

public class MyArraySizeException extends RuntimeException {

    private static final String MESSAGE = "Размерность массива отличается от 4";

    public MyArraySizeException() {
        super(MESSAGE);
    }
}
