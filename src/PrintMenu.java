import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        int choice = 1;
        while (choice!=0){
            System.out.println("Enter your choice: ");
            choice= input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Draw the triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j <6-i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Draw the square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("3. Draw the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
