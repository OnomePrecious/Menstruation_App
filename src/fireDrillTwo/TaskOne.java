package fireDrillTwo;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int count = 0;
            int sum = 0;
            while(count < 10) {
                System.out.println("Enter scores: ");
                int score = input.nextInt();
                count++;

                sum += score;
            }
        System.out.println("The sum is:" +  sum);

}
}
