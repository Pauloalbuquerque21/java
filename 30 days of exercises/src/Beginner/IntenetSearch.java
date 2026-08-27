package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class IntenetSearch {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int linkThree = scanner.nextInt();
        int linkOne = (linkThree*2)*2;
        System.out.println(linkOne);

    }
}
