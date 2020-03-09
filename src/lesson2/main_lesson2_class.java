package lesson2;

public class main_lesson2_class {

    public static void main(String[] args) {
        String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";

        try {
            System.out.println(toArray(string));
        } catch (NumberFormatException e) {
            System.out.println("Не удалось завершить операцию. В массиве содержится символ или буква");
        }
    }

    public static int toArray(String a) {
        String[] firstArray = a.split("\n");
        if (firstArray.length != 4) throw new ArrayIndexOutOfBoundsException("Ошибка! Массив не соответствует размерам 4х4");
        String[][] secondArray = {
            firstArray[0].split(" "),
            firstArray[1].split(" "),
            firstArray[2].split(" "),
            firstArray[3].split(" "),
        };

        int[][] thirdArray = new int[4][4];
        int sum = 0;
        int result = 0;

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                thirdArray[i][j] = Integer.parseInt(secondArray[i][j]);
                sum += thirdArray[i][j];
            }
       }
        return (result = sum / 2);
    }
}
