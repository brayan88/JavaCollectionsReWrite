import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 30.3.2016 г..
 */
public class _01_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= input.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            System.out.print(number+" ");
        }
    }
}
