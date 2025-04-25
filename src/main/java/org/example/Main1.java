package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 5:");
        scanner.nextLine();
        System.out.println("Hello, World!"+scanner.nextLine());
        System.out.println("Next line");
        scanner.nextLine();
        System.out.println("Next line");
    }
}
