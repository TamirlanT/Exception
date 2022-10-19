package HomeWork;
/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public static int sum2d(String[][] arr)
{ int sum = 0; for (int i = 0; i < arr.length; i++)
 { for (int j = 0; j < 5; j++)
 { int val = Integer.parseInt(arr[i][j]);
  sum += val; } } return sum; }
 */
public class Homework2 {
    public static void main (String[]args){
//         String [][] array = new String [][]{{"1","2","1","2","1","2"},{"2","1","1","2","1","2"},{"2","1","1","2","1","2"},{"2","1","1","2","1","2"}}; //обычная работа метода

//         String [][] array = new String [][]{{"1","2","1"},{"2","1"},{"2","1",},{"2","1"}}; // .ArrayIndexOutOfBoundsException

//        String [][] array = new String [][]{{"f","2","1"},{"2","1"},{"2","1",},{"2","1"}}; // NumberFormatException

        String [][] array = new String [][]{{"0","0","-1","1","0"},{"-1", "1", "0" , "0", "0"},{"-1", "1", "0","0", "0"},{"1", "-1", "0", "0", "0"}};
        System.out.println(sum2d(array));
    }
        public static int sum2d(String[][] arr) {
        int sum = 0;
            for (String[] strings : arr) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(strings[j]);
                    sum += val;
                }
            }
            return sum;
    }

}
