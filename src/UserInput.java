import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello  " + name);
        System.out.println("You are " + age + "years old");


        //calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area od the rectangle is: " + area);

        scanner2.close();
    }
}
