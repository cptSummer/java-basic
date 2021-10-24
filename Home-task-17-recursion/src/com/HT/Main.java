package com.HT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.println("Program running on AMD A4-3400 APU\nEnter any key to continue");
        s.nextLine();
        for (int i = 0; i <= 50; i++) {
            long start = System.currentTimeMillis();
            System.out.printf("Fibonacci %2d = %d >>> ", i, m.fibonacci(i));
            System.out.println(System.currentTimeMillis() - start + " ms");
        }
    }

    long fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
