import java.util.Scanner;
public class HowMuchCassava {
    public static void main(String[] args) {
        int[] howMushEats = {300,1500, 600, 1000, 150};
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int result = 0;
        while(5 > amount){
            int valueOfUser = scanner.nextInt();
            result = result + (howMushEats[amount] * valueOfUser);
            amount++;
        }
        scanner.close();
        System.out.println(result+250);
    }
}
