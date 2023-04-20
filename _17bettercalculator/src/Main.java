import java.util.Scanner;

public class Main{
    public static void main (String [] args){

        System.out.println(calc());

    }

    public static double calc(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter an operand: ");
        String op = input.next();

        System.out.println("Enter a number: ");
        double num2 = input.nextDouble();

        double result = 0;

        if(op.equals("+")){
             result = num1 + num2;
        }else if(op.equals("-")){
             result = num1 - num2;
        }else if(op.equals("*")){
             result = num1 * num2;
        }else if(op.equals("/")){
             result = num1 / num2;
        }else{
            System.out.println("Invalid operand");
        }

        return result;

    }

}

