package com.sda.powtorka;

import java.util.Scanner;

public class PowtorkaMain {
    public static void main(String[] args) {
        System.out.println("To write rectangle type 1");
        System.out.println("To write square type 2");
        System.out.println("To write triangle type 3");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Please insert lengt ad sideA");
                int sideA = scanner.nextInt();
                System.out.println("Please insert lengt ad sideB");
                int sideB = scanner.nextInt();
                Rectangle rec = new Rectangle(sideA, sideB);
                rec.draw();
                break;

            case 2:
                System.out.println("Please insert lengt ad side");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.draw();
                break;

        }
    }

}
