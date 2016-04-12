import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pc on 12.4.2016 г..
 */
public class _08_ExtractAllUniqueWords {
    public static void main(String[] args) {
//        String text = "Welcome to SoftUni. Welcome to Java.".toLowerCase();
        Scanner input = new Scanner(System.in);
        String line = input.nextLine().toLowerCase();
        String [] text = line.split("\\W+");
        Set<String> unique = new TreeSet<String>();
        for (String word : text) {
            unique.add(word);
        }
        for (String word : unique) {
            System.out.printf(word+ " ");
        }

//          hardway
//        ArrayList<String> words = new ArrayList<>();
//        String word ="";
//        int counter=0;
//        for (int i = 0; i < text.length(); i++) {
//            char c =text.charAt(i);
//            if (c==' '||c=='.'||c=='!'||c=='?'||c=='-'||c==','){
//                if (counter>1) {
//                    words.add(word);
//                }
//                word ="";
//                counter=0;
//            }
//            else{
//                counter++;
//                word += c;
//            }
//        }

//        for (String s : unique) {
//            System.out.print(s+" ");
//        }



    }
}
