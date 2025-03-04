package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.printf("%d\n%d\n%d\n",a,b,c);
    }
}
