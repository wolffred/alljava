public class temp {

    public static void main(String[] args) {

        int n = (int)(Math.random()*100)+1;
        System.out.println(""+n);

        if(n == 0 ) {
            System.out.println("frozen");
        } else if (n > 0 && n <= 14) {
            System.out.println("cold");
        }
        else if (n > 14 && n <= 24) {
            System.out.println("cool");
        }
        else if (n > 24 && n <= 40) {
            System.out.println("warm");
        }
        else if (n > 40 && n <= 60) {
            System.out.println("hot");
        }else if (n > 60 && n <= 80) {
            System.out.println("very hot");
        }else if (n > 80 && n <= 99) {
            System.out.println("extremely hot");
        }else if (n == 100) {
            System.out.println("boiling");
        }

    }
}
