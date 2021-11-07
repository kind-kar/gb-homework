package homework2;

public class App {

    public static void main(String[] args) {
        final App app = new App();
        String [][] twoDimArray = {
                {"17", "3", "5", "7"},
                {"17", "3", "5", "7"},
                {"17", "3", "5", "7"},
                {"17", "3", "xdfgfh", "7"}
        };
        int sum = app.calculateSumArray(twoDimArray);
        System.out.println(sum);
    }

    private int calculateSumArray(String[][] twoDimArray) {
        if (twoDimArray.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            if (twoDimArray[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                try {
                    final int num = Integer.parseInt(twoDimArray[i][j]);
                    sum += num;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, e);
                }
            }

        }
        return sum;
    }
}