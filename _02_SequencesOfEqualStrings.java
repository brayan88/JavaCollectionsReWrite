import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Admin on 30.3.2016 г..
 */
public class _02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String [] array = s.split(" ");
        String first="";
        String second="";
        int counter= 0;
        for (int i = 0; i < array.length; i++) {
            first =array[i];
            if (i==0){
                System.out.printf(first+" ");
            }
            else {
                for (int j = 0 + i; j <= i; j++) {
                    second = array[j-1];
                    if (first.equals(second)) {
                        System.out.printf(second+" ");
                    }
                    else {
                        System.out.println();
                        System.out.printf(first+" ");
                    }
                }
            }
        }
    }
}
