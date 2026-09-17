import java.sql.SQLOutput;
import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args){

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(zoo animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a size description: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an action ending with 'ing': ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a descriptive word: ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + "zoo");
        System.out.println("At the zoo, I saw a " + noun1);
        System.out.println("The " + noun1 + "was " + adjective2 + "in size, and it was "+ verb1 + "up and down." );
        System.out.println("I walked around a little more and my experience there was overally " + adjective3);

        scanner.close();
    }
}
