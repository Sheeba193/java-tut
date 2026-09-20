import java.util.Scanner;

public class Mathproblems {
//    public static void main (String[] args){
//
//        System.out.println(Math.PI);
//
//        double result;
//        double absresult;
//        double sqrresult;
//
//        result = Math.pow(2,3);
//        absresult = Math.abs(-5);
//        sqrresult = Math.sqrt(496);
//
//
//        System.out.println(result);
//        System.out.println(absresult);
//        System.out.println(sqrresult);
//
//
//    }
    public static void main(String[] args){
        //HYPOTENUSE OF A TRIANGLE = sqrt of the sum of the squares of the sides

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;


        System.out.println("enter length of side a: ");
        a = scanner.nextDouble();

        System.out.println("enter length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("the hypotenuse length is: %.2fsqr units ", c );
        scanner.close();
    }
}
