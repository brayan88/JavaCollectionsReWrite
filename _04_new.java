/**
 * Created by Admin on 4.4.2016 г..
 */
public class _04_new {
    public static void main(String[] args) {
        String text = "10 9 8 7 6 5 4 3 2 1";
//        Scanner sc = new Scanner(System.in);
//        String [] line = sc.nextLine().split(" ");
        String [] line =text.split(" ");
        int [] numbers= new int[line.length];
        int currentLenght=1;
        int startInd=0;
        int endInd=1;
        int longestStart=0;
        int longestLenght=0;
        int maxLenght=0;

        for (int i = 0; i < numbers.length-1; i++) {
            numbers[i]=Integer.parseInt(line[i]);
            numbers[i+1]=Integer.parseInt(line[i+1]);
            endInd++;
            if (numbers[i]<numbers[i+1]&&i+1!=numbers.length-1) {
                currentLenght++;
                if (currentLenght > maxLenght) {
                    maxLenght = currentLenght;
                    longestStart = startInd;
                    longestLenght = endInd - startInd;
                }
            }
            else if (currentLenght<2&&numbers[i]>=numbers[i+1]){
                    System.out.println(numbers[i]);
                startInd=endInd-1;

                }
            else if (numbers[i]>=numbers[i+1]||i+1==numbers.length-1){
                    int begin = startInd;
                if (i+1==numbers.length-1){
                    currentLenght++;
                    if (currentLenght > maxLenght) {
                        maxLenght = currentLenght;
                        longestStart = startInd;
                        longestLenght = endInd - startInd;
                    }

                    for (int j = 0; j <currentLenght ; j++) {
                        System.out.printf("%d ",numbers[begin++]);

                    }
                }
                else {
                    for (int j = 0; j < currentLenght; j++) {
                        System.out.printf("%d ", numbers[begin++]);
                        System.out.println();

                    }

                }
                currentLenght=1;
                System.out.println();
                startInd=endInd-1;

                }
            else {

                }
             }

        System.out.print("Longest: ");
        if (maxLenght<=1){
            System.out.println(numbers[0]);
        }
        for (int i = 0; i <longestLenght; i++) {
            System.out.printf("%d ",numbers[longestStart++]);
        }

    }
}
