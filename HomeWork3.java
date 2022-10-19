package HomeWork;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 9, 20,};
        int[] arr2 = new int[]{2, 3, 5};
        int []result = massive(arr1,arr2);
        print(result);
    }

    public static int[] massive(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длинна массивов не совпадает");
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                     result[i] = arr1[i] / arr2[i];
                }
            }
        return result;
        }
    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
        }
            String innArrayString = Arrays.toString(arr);
            System.out.println(innArrayString);
    }
}
