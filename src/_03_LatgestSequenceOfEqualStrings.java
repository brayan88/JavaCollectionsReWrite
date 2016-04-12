import java.util.Arrays;

/**
 * Created by Admin on 1.4.2016 г..
 */
public class _03_LatgestSequenceOfEqualStrings {
    public static void main(String[] args) {
        String text = "1 1 2 2 3 3 4 4 5 5";
        String [] array = text.split(" ");
        String first ="";
        String second ="";
        String equalsCounter="";
        String egualGroup="";
        int eCounter =1;

        for (int i = 0; i < array.length-1;i++) {
           first = array[i];
        second = array[i + 1];
            if (first.equals(second)) {
            equalsCounter += first + " ";
            eCounter++;
            } else {

            if (eCounter%2==0&& eCounter!=0){
                egualGroup+=equalsCounter;
                egualGroup+=first;
            }
            else{
                egualGroup=equalsCounter;
            }

            equalsCounter="";
            eCounter=0;
            }
        }System.out.println(egualGroup);
    }
}
