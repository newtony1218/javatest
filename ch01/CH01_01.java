import java.util.Arrays;

public class CH01_01 {

    public static void main(String[] args) {
        int[] array = { 10, 30, 20, 70, 40, 100, 99, 200, 105, 107, 201, 102 };
        toMaopao(array);
        System.out.println(Arrays.toString(array));
    }

    public static void toMaopao(int[] array) {
        int i, j = 0;
        for (i = 0; i < array.length; i++) {
            for (j = i; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = 0;
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

    }
}