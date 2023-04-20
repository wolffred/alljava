import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        String color;
        String celeb;

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER COLOR: ");
        color = input.next();

        System.out.println("ENTER CELEB: ");
        celeb = input.next();

        System.out.println("ROSES ARE " + color);
        System.out.println("VIOLETS ARE " + celeb);


    }
}
