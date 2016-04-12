import java.util.Scanner;

/**
 * Created by Admin on 12.4.2016 г..
 */
public class _06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String [] text = input.nextLine().toLowerCase().split("[ '-]");
        String word = input.next();
        int wordCounter = 0;

        for (int i = 0; i < text.length; i++) {
            if (word.equals(text[i])){
                wordCounter++;
            }

        }
        System.out.println(wordCounter);
    }
}
