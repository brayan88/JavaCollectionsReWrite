import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 13.4.2016 г..
 */
public class _09_MostFrequentWord {
    public static void main(String[] args) {
        String text  = "in the middle of the night";
        String [] words =text.split("\\W+");
        int counter =1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (i<=1){
                for (int j = i-1; j ==0  ; j--) {
                    if (words[i].equals(words[j]));
                    counter++;
                    list.add(words[i]);
                    list.add(words[j])
                }
                counter =1;
            }

        }
        for (String s : list) {
            System.out.println(s);

        }
    }
}
