import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 12.4.2016 г..
 */
public class _07_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line1 = input.nextLine().split(" ");
        String[] line2 = input.nextLine().split(" ");
//        String [] line1 ={"h","e","l","l","o"};
//        String [] line2 ={"l","o","w"};
        int matchCounter = 0;

        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        for (String c : line1) {
            l1.add(c.charAt(0));
        }
        for (String c : line2) {
            l2.add(c.charAt(0));
        }

        for (int i = 0; i < l2.size(); i++) {
            matchCounter=0;

            for (int j = 0; j < l1.size(); j++) {
                if ((l2.get(i).equals(l1.get(j)))){
                matchCounter++;
                }
            }
            if (matchCounter==0){
                l1.add(l2.get(i));

            }
        }
        System.out.println(l1);

    }
}
