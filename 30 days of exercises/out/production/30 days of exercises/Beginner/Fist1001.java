import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;



public class Fist1001 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        int X = A + B;
        System.out.println("total = " + X);

    }



}
