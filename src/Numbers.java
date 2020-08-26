
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int max = num3; //declares the int for the largest number

        if (num1 > max || num2 > max){
            if (num1> num2) {
                max = num1;
            } else {
                max = num2;
            }
        }
        int min = num3;  // declares the int for the smallest number
        if (num1 < num2){
            min = num1;
        } else {
            min = num2;
        }

        int median = num1 + num2 + num3 - max - min;
        System.out.println("The largest number is " + max + "\nThe smallest number is " + min);


    }
}
