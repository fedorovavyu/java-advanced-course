import java.util.Random;

public class Main {
    private static String[][] array = new String[4][4];

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(rand.nextInt(10));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        // Проверка
        //array[3][3] = "hi";
        //array[3][4] = String.valueOf(10);
        int sum = 0;


        try {
            sum = calculateSum(array);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }


    }
    private static int calculateSum(String[][] str) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++){
                if (str.length != 4 || str[i].length != 4){
                    throw new MyArraySizeException("Неверный размер массива! Массив должен быть 4х4.");
                }
                try {
                    sum += Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
