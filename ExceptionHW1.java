package HomeWork;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class ExceptionHW1 {
    public static void main(String[] args) {
        //System.out.println(ArifmeticExc(3,0));
        //int[] array = new int[]{1, 2, 3, 4, 5};
        //view(array, 6);
        number (4,4);

    }

    public static int ArifmeticExc(int x, int y) {
        return x / y;
    }

    public static void view(int array[],int num){
        int result = oufOfBound(array, num);
        switch(result){
            case -1:
                System.out.println("Выход за пределы массива");
        }
    }

    public static int oufOfBound(int[] array, int num) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
                return index;
            }
        }
        return -1 ;
    }

    public static void number (int num1, int num2){
        if (num1 > num2){
            System.out.println("Первое больше другого");
            if(num1 < num2){
                System.out.println("Второе число больше первого");
            }
//        if (num1 ==num2){
//            System.out.println("Числа равны");
        } else{
            throw new RuntimeException(" Неравильный формат числел");
        }
    }
}
